public class TestTrie {

    /**
     * h-a-p-p-y
     *     |
     *     o
     *     |
     *     s
     *     |
     *     i
     *     |
     *     t
     *     |
     *     i
     *     |
     *     v
     *     |
     *     e
     * @param args
     */

    public static void main(String args[]) {

        Trie trie = new Trie();
        trie.addWord("happy");
        trie.addWord("positive");
        System.out.println(trie.searchWord("happy"));
        System.out.println(trie.searchWord("happ"));
        System.out.println(trie.searchWord("positive"));
        System.out.println(trie.searchPrefixofWord("happ"));

    }
}
