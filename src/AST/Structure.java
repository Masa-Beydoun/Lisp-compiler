package AST;

public class Structure {
    CreateAnInstance createAnInstance ;
    CreateStructure createStructure ;
    Access access;
    @Override
    public String toString() {
        StringBuilder result = new StringBuilder("Structure{");
        boolean firstField = true;

        if (createAnInstance != null) {
            result.append("createAnInstance=").append(createAnInstance);
            firstField = false;
        }
        if (createStructure != null) {
            if (!firstField) result.append(", ");
            result.append("createStructure=").append(createStructure);
        }
        if (access != null) {
            if (!firstField) result.append(", ");
            result.append("access=").append(access);
        }

        result.append('}');
        return result.toString();
    }


    public CreateStructure getCreateStructure() {
        return createStructure;
    }

    public void setCreateStructure(CreateStructure createStructure) {
        this.createStructure = createStructure;
    }

    public CreateAnInstance getCreateAnInstance() {
        return createAnInstance;
    }

    public void setCreateAnInstance(CreateAnInstance createAnInstance) {
        this.createAnInstance = createAnInstance;
    }

    public Access getAccess() {
        return access;
    }

    public void setAccess(Access access) {
        this.access = access;
    }
}
