package dominio;

import java.time.LocalDateTime;

public abstract class Base {
    private static long proximoId = 0;
    private long id;
    private boolean eliminado;
    private LocalDateTime createdAt;

    public Base() {
        this.id = generarId();
        eliminado = false;
        createdAt = LocalDateTime.now();
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public boolean isEliminado() {
        return eliminado;
    }

    public void setEliminado(boolean eliminado) {
        this.eliminado = eliminado;
    }

    public LocalDateTime getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(LocalDateTime createdAt) {
        this.createdAt = createdAt;
    }

    private long generarId() {
        return proximoId++;
    }

    @Override
    public String toString() {
        return "Base{" +
                "id=" + id +
                ", eliminado=" + eliminado +
                ", createdAt=" + createdAt +
                '}';
    }
}