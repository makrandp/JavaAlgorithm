package com.java.algothrim;

import com.java.algothrim.array.ProductofArrayExceptSelf;
import com.java.algothrim.backTracking.GenerateParentheses;
import com.java.algothrim.backTracking.Subsets;
import com.java.algothrim.binaryTree.KthSmallestElementinaBST;
import com.java.algothrim.binaryTree.TreeNode;
import com.java.algothrim.dimensionArray.RotateImage;

import java.util.Arrays;

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

        int[][] matrix = {{1,2,3},{4,5,6},{7,8,9}};
        RotateImage.rotate(matrix);
        System.out.println(Arrays.deepToString(matrix));

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
    }



}
