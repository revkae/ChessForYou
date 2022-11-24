package me.raven.Utils;

import static org.lwjgl.opengl.GL30.glBindVertexArray;
import static org.lwjgl.opengl.GL30.glGenVertexArrays;

public class VertexArrayBuffer {

    private int id;

    public VertexArrayBuffer() {
        id = glGenVertexArrays();
        glBindVertexArray(id);
    }

    public void bind() {
        glBindVertexArray(id);
    }

    public void unbind(){
        glBindVertexArray(0);
    }
}
