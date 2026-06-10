import java.time.LocalDateTime;

public abstract class Base {
    private static Long nextId = 1L;

    private long id;
    private boolean eliminated;
    private LocalDateTime createdAt;

    public Base() {
        this.id = nextId++;
        this.eliminated = false;
        this.createdAt = LocalDateTime.now();
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public boolean isEliminated() {
        return eliminated;
    }

    public void setEliminated(boolean eliminated) {
        this.eliminated = eliminated;
    }

    public LocalDateTime getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(LocalDateTime createdAt) {
        this.createdAt = createdAt;
    }

    @Override
    public abstract String toString();
}
