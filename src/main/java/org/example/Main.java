package org.example;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import java.util.*;

public class Main {

    public static void main(String[] args) throws IOException {
/*
12
bnb2011 chansol
chansol chogahui05
chogahui05 jthis
jthis ChongChong
jthis jyheo98
jyheo98 lms0806
lms0806 pichulia
pichulia pjshwa
pjshwa r4pidstart
r4pidstart swoon
swoon tony9402
tony9402 bnb2011
 */
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());

        Set<String> set = new HashSet<>();
        set.add("ChongChong");
        for (int i = 0; i < n; i++) {
            st = new StringTokenizer(br.readLine());
            String temp = st.nextToken();
            String temp2 = st.nextToken();
            //맨 처음 값들이 ChongChong이 없을때는 set에 들어가지 않는다
            //ChongChong이라는 값이 오면 이미 ChongChong이 있기 때문에 들어가기 시작함
            //그 후 총총과 만난 사람도 들어갔기 떄문에 그 사람과 비교
            System.out.println("temp = " + temp);
//            if(temp.contains(temp)){
//                System.out.println("temp = " + temp);
//                System.out.println("temp2 = " + temp2);
//            }
            
            if(temp.contains(temp) || temp2.contains(temp)) {
                set.add(temp);
                set.add(temp2);
            }
        }
        System.out.println(set.size());

    }
}