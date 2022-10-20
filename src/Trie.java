/**
 * Trie DataStructure Implementation
 *
 */
public class Trie {

    private TrieNode trieNode;

    Trie () {
        trieNode = new TrieNode();
    }

    /**
     * add word in trie datastrucuture
     * @param word
     */
    public void addWord(String word) {
        TrieNode node = trieNode;
        for(int i=0; i<word.length(); i++) {
            char ch = word.charAt(i);
            if(!node.containsKey(ch)) {
                node.putKey(ch, new TrieNode());
            }
            node = node.getKey(ch);
        }
        node.setEnd();
    }

    /**
     * Search prefix word in Trie DataStructure
     * @param word
     * @return
     */
    private  TrieNode searchPrefix(String word) {
        TrieNode node = trieNode;
        for(int i=0; i<word.length(); i++) {
            char ch = word.charAt(i);
            if(node.containsKey(ch)) {
                 node = node.getKey(ch);
            } else {
                return null;
            }
        }
        return node;
    }


    public boolean searchWord(String word) {
        TrieNode node = searchPrefix(word);
        return node!= null && node.getEnd();
    }

    public boolean searchPrefixofWord(String word) {
        TrieNode node = searchPrefix(word);
        return node!= null;
    }

}
