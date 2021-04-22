package com.java.algothrim;

import com.java.algothrim.LinkList.CopyListwithRandomPointer;
import com.java.algothrim.LinkList.ListNode;
import com.java.algothrim.LinkList.OddEvenLinkedList;
import com.java.algothrim.LinkList.RandomNode;
import com.java.algothrim.String.BasicCalculatorII;
import com.java.algothrim.String.PalindromePartitioning;
import com.java.algothrim.String.RearrangeSpacesBetweenWords;
import com.java.algothrim.array.*;
import com.java.algothrim.backTracking.AllValidPermutationsOfParenthesesI;
import com.java.algothrim.backTracking.CombinationsOfCoins;
import com.java.algothrim.backTracking.LetterCombinationsPhoneNumber;
import com.java.algothrim.backTracking.LongestSubstringwithAtLeastKRepeatingCharacters;
import com.java.algothrim.binaryTree.*;
import com.java.algothrim.dynamicPrograming.fibonacci.HouseRobber;
import com.java.algothrim.dynamicPrograming.fibonacci.UniquePath;
import com.java.algothrim.dynamicPrograming.fibonacci.WordBreak;
import com.java.algothrim.heap.KthSmallestElementInSortedMatrix;
import com.java.algothrim.objectDesign.ShuffleAnArray;
import com.java.algothrim.objectDesign.TicTacToe;
import com.java.algothrim.search.FourSum;
import com.sun.source.tree.Tree;

import java.util.Arrays;
import java.util.List;

public class Main {

    public static void main(String[] args) {
//        Fibonacci.test();
//        System.out.println(CountVally.countingValleys(8,"UDDDUDUU"));
//        System.out.println(CountVally.countingValleys(12,"DDUUDDUDUUUD"));

//        System.out.println(JumpingOnClouds.jumpingOnClouds(new int[]{0,0,1,0,0,1,0}));

//        System.out.println(RepeatedString.repeatedString("aba",10));

        //TwoStrings.twoStrings("hi","world");

//        ReverseString.reverseString(new char[]{'h', 'e', 'l', 'l', 'o'});
//        ReverseString.reverseString(new char[]{'H','a','n','n','a','h'});
//


//
//        one.next = two;
//        two.next = three;
//        three.next = four;
//
//        ListNode Result = ReverseList.reverseListR(one);
//        System.out.println(Result);


//        for (int i = 0; i <=15 ;i++){
//            System.out.println(FizzBuzz.fizzBuzz(i));
//        }

//        List<Integer> list = new ArrayList<>(List.of(3,2,3));
//        int[] nums = {3,2,3};
//        int[] nums1 = {0,1,1,1,1,2,3,4,0};
//        int[] nums2 = {0,1,0,3,12};
//        int[] nums3 = {1,0};
//        MoveZero.moveZeroes1(nums3);
//        System.out.println(Arrays.toString(nums3));
//        int[] nums4 = {7,1,5,3,6,4};
//        System.out.println(StockProfit.maxProfit(nums4));
//
//        int c = 2202;
//        String unicode = Character.toString((char)c);
//
//        String s = "anagram" + unicode;
//        String t = unicode + "nagaram";
//        System.out.println(s);
//        System.out.println(t);
//        System.out.println(ValidAnagram.isAnagram(s,t));


//        System.out.println(ExcelSheetColumnNumber.titleToNumber("AAZ"));
//        System.out.println(ExcelSheetColumnNumber.convertToTitle(728));
//        System.out.println(ExcelSheetColumnNumber.convertToTitle(731));

//        List<List<Integer>> list = PascalTriangle.generate(5);
//        System.out.println(PascalTriangle.print2DArray(list));

//        int[] nums = {3,0,1};
//        System.out.println(MissingNumber.missingNumber(nums));

//        int[] nums1 = {1,2,2,1};
//        int[] nums2 = {2,2};
//
//        System.out.println(Arrays.toString(IntersectionofTwoArrays.intersect(nums1,nums2)));

//        System.out.println(NumberOf1Bits.hammingWeight(00000000000000000000000000001011));

//        System.out.println(HappyNumber.isHappy(19));

//        System.out.println(MaximumSubarray.maxSubArray(new int[]{1, 2, -1, 2}));
//        System.out.println(RemoveDuplicates.removeDuplicates(new int[]{1, 1, 2}));
//        System.out.println(Arrays.toString(PlusOne.plusOne1(new int[]{1, 1, 1})));
//        System.out.println(45 % 3);
//        System.out.println(Arrays.toString(PlusOne.plusOne1(new int[]{1, 1, 1})));

//        System.out.println(CountPrimes.countPrimes(499979));
//        CountPrimes.testLoop(13);

//        System.out.println(MissingRanges.findMissingRanges(new int[]{-1},-1,-1));
//        System.out.println(MissingRanges.findMissingRanges(new int[]{0,1,3,50,75},0,99));

//        System.out.println(ReverseInteger.reverse(-123));

//        System.out.println(Permutations.permute(new int[]{1,2,3}));
//        System.out.println(GenerateParentheses.generateParenthesisBackTracking(3));

//        System.out.println(Subsets.subsets1(new int[]{1,2,3,4}));

//        TreeNode root = new TreeNode(1);
//        root.left = new TreeNode(2);
//        root.right = new TreeNode(3);
//        root.left.left = new TreeNode(4);
//        root.left.right = new TreeNode(5);
//
//        System.out.println(KthSmallestElementinaBST.kthSmallest(root,1));

//        System.out.println(Arrays.toString(ProductofArrayExceptSelf.productExceptSelf(new int[]{1,2,3,4})));

//        int[][] matrix = {{1,2,3},{4,5,6},{7,8,9}};
//        RotateImage.rotate(matrix);
//        System.out.println(Arrays.deepToString(matrix));

//        int k = 4;
//        for(int i = 0 ; i < (k + 1) / 2 ; i ++){
//            for(int j = 0; j < k  / 2 ; j ++ ){
//                System.out.println("i " + i);
//                System.out.println("j " + j);
//                System.out.println();
//
//
//            }
//        }

//        System.out.println(GroupAnagrams.groupAnagrams1(
//                new String[]{"eat", "tea", "tan", "ate", "nat", "bat"}));

//        System.out.println(KthLargestElemenInArray.findKthLargestMergeSort(new int[]{3,2,1,5,6,4}, 2));

//        int[][] board  = new int[][]{{0,1,0},{0,0,1},{1,1,1},{0,0,0}};
//        GameofLife gameofLife = new GameofLife(board);
//        GameofLife newGame = gameofLife.next();
//        System.out.println(Arrays.deepToString(newGame.gameBoard));


//        ListNode root = new ListNode(2);
//        root.next = new ListNode(1);
//        root.next.next = new ListNode(3);
//        root.next.next.next = new ListNode(5);
//        root.next.next.next.next = new ListNode(6);
//        root.next.next.next.next.next = new ListNode(4);
//        root.next.next.next.next.next.next = new ListNode(7);

//        ListNode root = new ListNode(1);
////        root.next = new ListNode(2);
////        root.next.next = new ListNode(3);
////        root.next.next.next = new ListNode(4);
////        root.next.next.next.next = new ListNode(5);
////        root.next.next.next.next.next = new ListNode(6);
////        root.next.next.next.next.next.next = new ListNode(7);
////        root.next.next.next.next.next.next.next
////                = new ListNode(8);
////
////
////
////        ListNode temp = OddEvenLinkedList.oddEvenList(root);
////        System.out.println(temp);

//        int[][] martix = new int[][]{{1,2,3,4,5},{6,7,8,9,10},{11,12,13,14,15},{16,17,18,19,20},{21,22,23,24,25}};
//        System.out.println(KthSmallestElementInSortedMatrix.kthSmallestHeap(martix,25));


//        System.out.println(UniquePath.uniquePathDP(3,2));

//        TicTacToe obj = new TicTacToe(3);
//        int param_1 = obj.move(0,0,1);
//        int param_2 = obj.move(0,2,2);
//        int param_3 = obj.move(2,2,1);
//        int param_4 = obj.move(1,1,2);
//        int param_5 = obj.move(2,0,1);
//        int param_6 = obj.move(1,0,2);
//        int param_7 = obj.move(2,1,1);
//        int[] array = new int[]{param_1,param_2,param_3,param_4,param_5,param_6,param_7};
//
//        System.out.println(Arrays.toString(array));

//        int[] nums = new int[]{-1,0,1,2,-1,-4,-2,-3,3,0,4};
//        System.out.println(ThreeSum.threeSumTwoPointer(nums));

//        int nums[] = new int[]{1,2,3};
//        ShuffleAnArray shuffleAnArray = new ShuffleAnArray(nums);
//        System.out.println(Arrays.toString(shuffleAnArray.shuffle()));
//        System.out.println(Arrays.toString(shuffleAnArray.reset()));
//        System.out.println(Arrays.toString(shuffleAnArray.shuffle()));

//        FourSum fourSum = new FourSum();
//        List<List<Integer>> list = fourSum.fourSum(new int[]{1,0,-1,0,-2,2},0);
//        System.out.println(list);

//        PalindromePartitioning p = new PalindromePartitioning();
//        System.out.println(p.partition("aab"));

//        int[] preorder = new int[]{3,1,2,4};
//        int[] inorder = new int[]{1,2,3,4};
//
//        ConstructBinaryTreefromPreorderandInorderTraversal c = new ConstructBinaryTreefromPreorderandInorderTraversal();
//        TreeNode root = c.buildTree(preorder,inorder);
//        System.out.println(root);

//        Node one = new Node(1);
//        one.left = new Node(2);
//        one.right = new Node (3);
//        one.left.left = new Node(4);
//        one.left.right = new Node(5);
//        one.right.left = new Node(6);
//        one.right.right = new Node(7);
//
//        PopulatingNextRightPointersinEachNode p = new PopulatingNextRightPointersinEachNode();
//        Node root = p.connect(one);
//        System.out.println(root);

//        LetterCombinationsPhoneNumber l = new LetterCombinationsPhoneNumber();
//        List<String> list = l.letterCombinations("");
//        System.out.println(list);


//        TreeNode root = new TreeNode(3);
//        TreeNode left= new TreeNode(5);
//        root.left = left;
//        root.right = new TreeNode (1);
//        root.left.left = new TreeNode(6);
//        root.left.right = new TreeNode(2);
//        root.right.left = new TreeNode(0);
//        root.right.right = new TreeNode(8);
//        root.left.right.left = new TreeNode(7);
//        TreeNode right = new TreeNode(4);
//        root.left.right.right = right;
//        LowestCommonAncestorBinaryTree l = new LowestCommonAncestorBinaryTree();
//        TreeNode node = l.lowestCommonAncestor(root,left,right);
//        System.out.println(node.val);

//        int[] matrix = new int[]{10,9,2,5,3,7,101,18};
//        LongestIncreasingSubsequence l = new LongestIncreasingSubsequence();
//        System.out.println( l.lengthOfLIS(matrix));


//        LongestSubstringwithAtLeastKRepeatingCharacters l = new LongestSubstringwithAtLeastKRepeatingCharacters();
//        String s = "ababbc";
//        System.out.println(l.longestSubstring(s,2));

//        TreeNode root = new TreeNode(6);
//        TreeNode target  = new TreeNode (2);
//        root.left = target;
//        root.right = new TreeNode(8);
//        root.left.left = new TreeNode(0);
//        root.left.right = new TreeNode(4);
//        root.left.right.left = new TreeNode(3);
//        root.left.right.right = new TreeNode(5);
//        root.right.left = new TreeNode(7);
//        root.right.right = new TreeNode(9);

//        TreeNode root = new TreeNode(2);
//        TreeNode target = root;
//        root.right = new TreeNode(3);
//        InorderSuccessorinBST i = new InorderSuccessorinBST();
//        TreeNode result = i.inorderSuccessorWhile(root,target);
//        System.out.println(result);

//        int[] nums = {1,2,3,1};
//        HouseRobber h = new HouseRobber();
//        System.out.println(h.rob(nums));

//        List<String> dict = Arrays.asList(new String[]{"leet","code"});
//        String s = "leetcode";
//        WordBreak w = new WordBreak();
//        System.out.println(w.wordBreak(s,dict));

//        RandomNode root = new RandomNode(1);
//        RandomNode next = new RandomNode(2);
//        RandomNode nextNext = new RandomNode(3);
//
//        root.next = next;
//        root.random = null;
//        next.next = nextNext;
//        next.random = root;
//        nextNext.random = null;
//
//        CopyListwithRandomPointer c = new CopyListwithRandomPointer();
//        RandomNode copy = c.copyRandomList(root);
//        System.out.println(copy);

//        int[][] intervals = new int[][] {{1,3},{2,6},{8,10},{15,18}};
//        int[][] intervals = new int[][] {{1,4},{2,3}};
//        MergeIntervals m = new MergeIntervals();
//        System.out.println(Arrays.deepToString(m.merge(intervals)));

//        int[] intervals = {5,4,3,2,1};
//        int[] intervals = {1,1,-2,6};
//        IncreasingTripletSubsequence i = new IncreasingTripletSubsequence();
//        System.out.println(i.increasingTriplet(intervals)
//        );


//        BasicCalculatorII b = new BasicCalculatorII();
//        System.out.println(b.calculate("3+2*2"));

//        AllValidPermutationsOfParenthesesI a = new AllValidPermutationsOfParenthesesI();
//        System.out.println(a.validParentheses(1,1,0));

//        CombinationsOfCoins c = new CombinationsOfCoins();
//        System.out.println(c.combinations( 4,new int[]{2, 1}));

        RearrangeSpacesBetweenWords r = new RearrangeSpacesBetweenWords();
        System.out.println(r.remove("abcd","ab"));
    }
}
