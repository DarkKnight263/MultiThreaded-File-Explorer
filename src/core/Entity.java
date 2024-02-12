package core;

import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

interface Entity extends Runnable {
    boolean DEBUG = true;

    static class criticalSectionHandler {
        private static final Set<Entity> lockedEntities = Collections.synchronizedSet(new HashSet<>());

        private static boolean lock(final Entity entity) {
            return lockedEntities.add(entity);
        }

        private static boolean unlock(final Entity entity) {
            return lockedEntities.remove(entity);
        }

        public static void getLockedEntities() {
            if (!DEBUG)
                return;
            synchronized (lockedEntities) {
                for (final Entity entity : lockedEntities)
                    System.out.println(entity);
            }
        }
    }

    String getName();

    String getPath();

    private void setName(final String name) {
    }

    private void setPath(final String path) {
    }

    ErrorCode create(final String... names);

    ErrorCode create(final String destination, final String... names);

    ErrorCode copy(final String destination);

    ErrorCode copy(final String newName, final String destination);

    ErrorCode delete(final String... names);

    ErrorCode delete(final String destination, final String... names);

    ErrorCode move(final String destination);

    ErrorCode move(final String destination, final String... newName);

    ErrorCode rename(final String newName);

}

interface File extends Entity {
    ErrorCode open();

    ErrorCode properties();
}

interface Folder extends Entity {
    ErrorCode list();

    ErrorCode regexFilter(final String pattern);

    ErrorCode stepIn(final String target);

    ErrorCode stepOut();
}