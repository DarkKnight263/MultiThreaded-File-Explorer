package core;

final class FolderImpl implements Folder {
    private String name, path;

    FolderImpl(final String name, final String path) {
        this.name = name;
        this.path = path;
    }

    FolderImpl(final String name, final String path, final FolderImpl obj) {
        this(name, path);
        // copy contents in obj to this
    }

    public String getName() {
        return name;
    }

    public String getPath() {
        return path;
    }

    private void setName(final String name) {
        this.name = name;
    }

    private void setPath(final String path) {
        this.path = path;
    }

    @Override
    public String toString() {
        return getPath() + getName();
    }

    @Override
    public ErrorCode create(String... names) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'create'");
    }

    @Override
    public ErrorCode create(String destination, String... names) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'create'");
    }

    @Override
    public ErrorCode copy(String destination) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'copy'");
    }

    @Override
    public ErrorCode copy(String newName, String destination) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'copy'");
    }

    @Override
    public ErrorCode delete(String... names) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'delete'");
    }

    @Override
    public ErrorCode delete(String destination, String... names) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'delete'");
    }

    @Override
    public ErrorCode move(String destination) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'move'");
    }

    @Override
    public ErrorCode move(String destination, String... newName) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'move'");
    }

    @Override
    public ErrorCode rename(String newName) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'rename'");
    }

    @Override
    public void run() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'run'");
    }

    @Override
    public ErrorCode list() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'list'");
    }

    @Override
    public ErrorCode regexFilter(String pattern) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'regexFilter'");
    }

    @Override
    public ErrorCode stepIn(String target) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'stepIn'");
    }

    @Override
    public ErrorCode stepOut() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'stepOut'");
    }
}