package AST;

public class SortOperation {
    Sort sort;
    StableSort stableSort;

    public Sort getSort() {
        return sort;
    }

    @Override
    public String toString() {
        StringBuilder result = new StringBuilder("SortOperation{");
        boolean firstField = true;

        if (sort != null) {
            result.append("sort=").append(sort);
            firstField = false;
        }
        if (stableSort != null) {
            if (!firstField) result.append(", ");
            result.append("stableSort=").append(stableSort);
        }

        result.append('}');
        return result.toString();
    }


    public void setSort(Sort sort) {
        this.sort = sort;
    }

    public StableSort getStableSort() {
        return stableSort;
    }

    public void setStableSort(StableSort stableSort) {
        this.stableSort = stableSort;
    }
}
