package com.massmotosperu.backend.Models;

import java.io.Serializable;
import java.util.Objects;

// Esta clase debe implementar Serializable
public class UsuarioRolId implements Serializable {
    private String usuarioID;
    private int rolID;

    public UsuarioRolId() {}

    public UsuarioRolId(String usuarioID, int rolID) {
        this.usuarioID = usuarioID;
        this.rolID = rolID;
    }

    // Implementa equals y hashCode
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        UsuarioRolId that = (UsuarioRolId) o;
        return rolID == that.rolID && usuarioID.equals(that.usuarioID);
    }

    @Override
    public int hashCode() {
        return Objects.hash(usuarioID, rolID);
    }
}
