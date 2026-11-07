package Stack;

class EmptyCollectionException extends RuntimeException {

    public EmptyCollectionException(String collection) {
        super("The " + collection + " is empty.");
    }
    static void main() {
        try {
            throw new EmptyCollectionException("stack");
        }
        catch (EmptyCollectionException e) {
            System.out.println("Caught: " + e.getMessage());
        }
    }
}
