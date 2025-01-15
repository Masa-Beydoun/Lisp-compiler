package AST;

public class ElementAccess {
    String CHAR;
    String aref;

    public String getCHAR() {
        return CHAR;
    }

    public void setCHAR(String CHAR) {
        this.CHAR = CHAR;
    }

    public String getAref() {
        return aref;
    }

    public void setAref(String aref) {
        this.aref = aref;
    }

    @Override
    public String toString() {
        StringBuilder result = new StringBuilder("ElementAccess{");
        boolean firstField = true;

        if (CHAR != null) {
            result.append("CHAR='").append(CHAR).append('\'');
            firstField = false;
        }
        if (aref != null) {
            if (!firstField) result.append(", ");
            result.append("aref='").append(aref).append('\'');
        }

        result.append('}');
        return result.toString();
    }

}
