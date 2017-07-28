package _127_BFS;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/**
 * Created by bjyushicong on 2017/7/27.
 */
public class Test {
//    beginWord = “hit”
//    endWord = “cog”
//    wordList = [“hot”,”dot”,”dog”,”lot”,”log”]
//    As one shortest transformation is “hit” -> “hot” -> “dot” -> “dog” -> “cog”,
//            return its length 5.
    public static int helper(String beginWord,String endWord,Set<String> wordList){

        if (!wordList.contains(endWord)){
            return 0;
        }
        Set<String> beginSet = new HashSet<String>();
        Set<String> endSet = new HashSet<String>();
        Set<String> visited = new HashSet<String>();
        beginSet.add(beginWord);
        beginSet.add(endWord);
        int len = 1;

        while(!beginSet.isEmpty() && !endSet.isEmpty()){
            if(beginSet.size() > endSet.size()){
                Set<String> tempSet = beginSet;
                beginSet = endSet;
                endSet = tempSet;
            }

        }

        return 0;
    }


    public static void main(String[] args) {
        String beginWord = "hit";
        String endWord = "cog";
        List<String> wordList = new ArrayList<String>();
        wordList.add("hot");
        wordList.add("dot");
        wordList.add("dog");
        wordList.add("lot");
        wordList.add("log");
        wordList.add("cog");
        int nums = helper(beginWord,endWord,wordList);
        System.out.println(nums);
    }
}
