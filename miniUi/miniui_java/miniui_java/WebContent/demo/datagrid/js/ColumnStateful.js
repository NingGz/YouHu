
//保持列状态：隐藏、宽度。

var ColumnStateful = function (grid, options) {
    this.grid = grid;
    this.options = $.extend({}, options);
    if (!this.options.stateId) throw new Error("stateId can not be empty");
    this.init();
}

ColumnStateful.prototype = {

    init: function () {

        var me = this,
            grid = me.grid;
        setTimeout(function () {
            grid.on("columnschanged", function (e) {
                me.saveState();
            });
        }, 1);

        me.restoreState();
    },

    getStateId: function () {
        return this.options.stateId;
    },

    createState: function () {
        var me = this,
            grid = me.grid;

        var state = { columns: [] };

        function eachColumns(columns, arr) {
            for (var i = 0, l = columns.length; i < l; i++) {
                var column = columns[i];
                var colState = {};

                colState.visible = column.visible;
                colState.width = column.width;

                if (column.name) colState.name = column.name;
                if (column.field) colState.field = column.field;
                if (column.type) colState.type = column.type;
                if (column.header) colState.header = column.header;

                arr.push(colState);

                if (column.columns && column.columns.length > 0) {
                    colState.columns = [];
                    eachColumns(column.columns, colState.columns);
                }
            }
        }

        eachColumns(grid.getColumns(), state.columns);

        //var json = mini.encode(state);
        //alert(json);

        return state;
    },

    saveState: function () {
        var me = this,
            grid = me.grid;

        var state = me.createState();
        var json = mini.encode(state);

        mini.Cookie.set(me.getStateId(), json, 100);
    },

    restoreState: function () {
        var me = this,
            grid = me.grid;


        var json = mini.Cookie.get(me.getStateId());

        if (json && json != "null") {
            var state = mini.decode(json);
            if (state.columns.length > 0) {

                function eachColumns(gridColumns, stateColumns) {
                    var newGridColumns = [];
                    for (var i = 0, l = stateColumns.length; i < l; i++) {
                        var colState = stateColumns[i];
                        var column = me.findColumnByState(colState, gridColumns);

                        column.width = colState.width;
                        column.visible = colState.visible;
                        newGridColumns.push(column);

                        if (column.columns && column.columns.length > 0) {
                            eachColumns(column.columns, colState.columns);
                        }
                    }

                    gridColumns.length = 0;
                    gridColumns.addRange(newGridColumns);
                }
                
                eachColumns(grid.columns, state.columns);

                grid.setColumns(grid.columns);
            }
        }
    },

    findColumnByState: function (colState, columns) {    //name, field
        var me = this,            
            column;

        function find(value, field) {
            for (var j = 0, k = columns.length; j < k; j++) {
                var o = columns[j];
                if (o[field] == value) {
                    return o;
                }
            }
        }        

        if (colState.name) {
            column = find(colState.name, "name");
            if (column) return column;
        }

        if (colState.field) {
            column = find(colState.field, "field");
            if (column) return column;
        }

        if (colState.type) {
            column = find(colState.type, "type");
            if (column) return column;
        }

        if (colState.header) {
            column = find(colState.header, "header");
            if (column) return column;
        }
        
    }
}
