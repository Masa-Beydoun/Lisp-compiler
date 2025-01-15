package AST;

public class OperatorClass extends NodeAST {
        private String operator; // The operator (e.g., PLUS, MINUS, etc.)

        // Constructor
        public OperatorClass(String operator) {
            this.operator = operator;
        }

        // Getter
        public String getOperator() {
            return operator;
        }

        // Setter
        public void setOperator(String operator) {
            this.operator = operator;
        }

        // Method to add functionality (example: perform operation)
//        public double apply(double... operands) {
//            switch (operator) {
//                case "PLUS":
//                    return operands[0] + operands[1];
//                case "MINUS":
//                    return operands[0] - operands[1];
//                case "MULTIPLY":
//                    return operands[0] * operands[1];
//                case "DIV":
//                    return operands[0] / operands[1];
//                case "MODULUS":
//                    return operands[0] % operands[1];
//                case "SIN":
//                    return Math.sin(operands[0]);
//                case "COS":
//                    return Math.cos(operands[0]);
//                case "TAN":
//                    return Math.tan(operands[0]);
//                case "SQRT":
//                    return Math.sqrt(operands[0]);
//                case "EXP":
//                    return Math.exp(operands[0]);
//                case "EXPT":
//                    return Math.pow(operands[0], operands[1]);
//                default:
//                    throw new UnsupportedOperationException("Unknown operator: " + operator);
//            }
//        }

        // Method to return string representation of the operator
        @Override
        public String toString() {
            return operator;
        }

//    @Override
//    public String prettyPrint(String indent) {
//        return indent;
//    }
}

