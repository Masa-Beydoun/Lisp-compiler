package AST;

public class Assignment {
    SetfAssignment SetfAssignment;
    SetqAssignment SetqAssignment;

    public AST.SetfAssignment getSetfAssignment() {
        return SetfAssignment;
    }

    public void setSetfAssignment(AST.SetfAssignment setfAssignment) {
        SetfAssignment = setfAssignment;
    }

    @Override
    public String toString() {
        StringBuilder result = new StringBuilder("Assignment{");
        boolean firstField = true;

        if (SetfAssignment != null) {
            result.append("SetfAssignment=").append(SetfAssignment);
            firstField = false;
        }
        if (SetqAssignment != null) {
            if (!firstField) result.append(", ");
            result.append("SetqAssignment=").append(SetqAssignment);
        }

        result.append('}');
        return result.toString();
    }


    public AST.SetqAssignment getSetqAssignment() {
        return SetqAssignment;
    }

    public void setSetqAssignment(AST.SetqAssignment setqAssignment) {
        SetqAssignment = setqAssignment;
    }
}
