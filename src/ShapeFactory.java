class ShapeFactory {
    public Shape createShape(String shapeType) {
        if (shapeType.equals("circle")) {
            return new Circle();
        } else if (shapeType.equals("square")) {
            return new Square();
        } else if (shapeType.equals("triangle")) {
            return new Triangle();
        } else {
            throw new IllegalArgumentException("not available");
        }
    }
}
