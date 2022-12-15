package board;

public class Position {
    
    private int row;
    private int column;
    private StatusPlace status;
    
    public Position(int row, int column, StatusPlace status){ //new constructor
        this.row = row;
        this.column = column;
        this.status = status;
    } 
    
    public Position(int row, int column){ //new constructor
        this.row = row;
        this.column = column;
    } 

    public Position(int row, char column){
        if
    }
    /**
     * @return int return the row
     */
    public int getRow() {
        return row;
    }

    /**
     * @param row the row to set
     */
    public void setRow(int row) {
        this.row = row;
    }

    /**
     * @return int return the column
     */
    public int getColumn() {
        return column;
    }

    /**
     * @param column the column to set
     */
    public void setColumn(int column) {
        this.column = column;
    }

    /**
     * @return StatusPlace return the status
     */
    public StatusPlace getStatus() {
        return status;
    }

    /**
     * @param status the status to set
     */
    public void setStatus(StatusPlace status) {
        this.status = status;
    }

    @Override
    public String toString(){
        return row + ", "  + column;
    }

}