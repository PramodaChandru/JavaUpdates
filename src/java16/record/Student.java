package java16.record;

public record Student(int id, String name) {
    public Student {
        if(id < 100) {
            throw new IllegalArgumentException("Invalid id format");
        }
    }

    @Override
    public String name() {
        return name.toLowerCase();
    }
}
