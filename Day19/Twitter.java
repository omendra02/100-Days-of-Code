package Day19;


import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

class Twitter {
    // LinkedList to store tweets chronologically
    ListNode tweets;
    // Keep track of followers for each user
    HashMap<Integer, ArrayList<Integer>> followings;

    public Twitter() {
        followings = new HashMap<>();
    }
    
    // Create a new node, and insert at beginning (head)
    public void postTweet(int userId, int tweetId) {
        if(tweets == null) {
            tweets = new ListNode(new Pair<Integer, Integer>(userId, tweetId));
        } else {
            ListNode node = new ListNode(new Pair<Integer, Integer>(userId, tweetId));
            node.next = tweets;
            tweets = node;
        }
    }
    
    public List<Integer> getNewsFeed(int userId) {
        List<Integer> ans = new ArrayList<>();
        ArrayList<Integer> followingList = followings.getOrDefault(userId, new ArrayList<>());

        ListNode tweet = tweets;
        while(ans.size() < 10 && tweet != null) {
            // check if user follows the poster
            if(followingList.contains(tweet.val.getKey()) || userId == tweet.val.getKey())
                ans.add(tweet.val.getValue());
            tweet = tweet.next;
        }
        return ans;
    }
    
    public void follow(int followerId, int followeeId) {
        ArrayList<Integer> followList = followings.getOrDefault(followerId, new ArrayList<>());
        followList.add(followeeId);
        followings.put(followerId, followList);
    }
    
    public void unfollow(int followerId, int followeeId) {
        ArrayList<Integer> followList = followings.getOrDefault(followerId, new ArrayList<>());
        followList.remove(Integer.valueOf(followeeId));
        followings.put(followerId, followList);
    }
}

// Helper
class ListNode {
    // To store (userId, tweet)
    Pair<Integer, Integer> val;
    ListNode next;

    public ListNode(Pair<Integer, Integer> val) {
        this.val = val;
        this.next = null;
    }
}
