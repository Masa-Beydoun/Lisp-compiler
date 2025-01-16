package AST;

public class Access {
    String Identifier1;
    String Identifier2;

    @Override
    public String toString() {
        StringBuilder result = new StringBuilder("Access{");
        boolean firstField = true;

        if (Identifier1 != null) {
            result.append("Identifier1='").append(Identifier1).append('\'');
            firstField = false;
        }
        if (Identifier2 != null) {
            if (!firstField) result.append(", ");
            result.append("Identifier2='").append(Identifier2).append('\'');
        }

        result.append('}');
        return result.toString();
    }


    public String getIdentifier1() {
        return Identifier1;
    }

    public void setIdentifier1(String identifier1) {
        Identifier1 = identifier1;
    }

    public String getIdentifier2() {
        return Identifier2;
    }

    public void setIdentifier2(String identifier2) {
        Identifier2 = identifier2;
    }
}
