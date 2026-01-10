package com.google.firebase.database.snapshot;

import com.google.firebase.database.DatabaseException;
import com.google.firebase.database.core.Path;

/* loaded from: /data/data/com.termux/files/home/mod/ori/classes4.dex */
public class PriorityUtilities {
    public static Node NullPriority() {
        return EmptyNode.Empty();
    }

    public static boolean isValidPriority(Node node) {
        return node.getPriority().isEmpty() && (node.isEmpty() || (node instanceof DoubleNode) || (node instanceof StringNode) || (node instanceof DeferredValueNode));
    }

    public static Node parsePriority(Object obj) {
        return parsePriority(null, obj);
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: com.google.firebase.database.DatabaseException */
    public static Node parsePriority(Path path, Object obj) throws DatabaseException {
        Node nodeNodeFromJSON = NodeUtilities.NodeFromJSON(obj);
        if (nodeNodeFromJSON instanceof LongNode) {
            nodeNodeFromJSON = new DoubleNode(Double.valueOf(((Long) nodeNodeFromJSON.getValue()).longValue()), NullPriority());
        }
        if (isValidPriority(nodeNodeFromJSON)) {
            return nodeNodeFromJSON;
        }
        throw new DatabaseException((path != null ? "Path '" + path + "'" : "Node") + " contains invalid priority: Must be a string, double, ServerValue, or null");
    }
}
