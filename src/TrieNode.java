/**
 * TrieDataStructure is also called Prefix Tree
 * This DataStructure has wide application scope
 * that works as a background idea of many real world pbms.
 * Examples : Auto-complete feature, Spell checker etc
 */

/**
 * This class represents structure of a TrieNode
 * lower case alphabets(a-z)
 */
public class TrieNode {

    private TrieNode nodeLinks[];

    // 26 letters(a-z)
    private static final int R = 26;

    // is the attribute that confirms word
    // in the Trie DataStructure is complete or not
    private boolean isEnd;

    // initialization
    public TrieNode() {
        nodeLinks = new TrieNode[R];
    }

    // Helper methods

    public boolean containsKey(char ch) {
        return nodeLinks[ch-'a'] != null;
    }

    public TrieNode getKey(char ch) {
        return nodeLinks[ch-'a'];
    }

    public void putKey(char ch, TrieNode node) {
        nodeLinks[ch-'a'] = node;
    }

    public void setEnd() {
        isEnd = true;
    }

    public boolean getEnd() {
        return isEnd;
    }
}
