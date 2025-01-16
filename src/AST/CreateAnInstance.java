package AST;

public class CreateAnInstance {
    CreateAnInstance2 createAnInstance2;
    CreateAnInstance1 createAnInstance1;

    public CreateAnInstance2 getCreateAnInstance2() {
        return createAnInstance2;
    }

    @Override
    public String toString() {
        StringBuilder result = new StringBuilder("CreateAnInstance{");
        boolean firstField = true;

        if (createAnInstance2 != null) {
            result.append("createAnInstance2=").append(createAnInstance2);
            firstField = false;
        }
        if (createAnInstance1 != null) {
            if (!firstField) result.append(", ");
            result.append("createAnInstance1=").append(createAnInstance1);
        }

        result.append('}');
        return result.toString();
    }


    public void setCreateAnInstance2(CreateAnInstance2 createAnInstance2) {
        this.createAnInstance2 = createAnInstance2;
    }

    public CreateAnInstance1 getCreateAnInstance1() {
        return createAnInstance1;
    }

    public void setCreateAnInstance1(CreateAnInstance1 createAnInstance1) {
        this.createAnInstance1 = createAnInstance1;
    }
}
