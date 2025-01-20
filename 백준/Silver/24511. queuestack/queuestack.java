import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        //  베열 개수 & 배열 생성
        //  Stack 의 경우 기존 값이 절대 바뀌지않음으로 무시
        int N = Integer.parseInt(br.readLine().trim());
        Queue<Integer> queue = new ArrayDeque<>();

        //  수열 A, B 불러온 순서대로 A 가 0인 경우만 Map 에 저장
        StringTokenizer seqA = new StringTokenizer(br.readLine());
        StringTokenizer seqB = new StringTokenizer(br.readLine());
        Map<Integer, Integer> map = new HashMap<>();
        int key = 1;
        for(int i = 0; i < N; i++){
            int A = Integer.parseInt(seqA.nextToken());
            int B = Integer.parseInt(seqB.nextToken());
            if(A==0){
                map.put(key, B);
                key++;
            }
        }

        //  Map 에 저장된 순서의 역순으로 Queue 에 add
        for(int i = key - 1; i > 0; i--){
            int num = map.get(i);
            queue.add(num);
        }

        //  새로운 값 개수 & 배열 C 가져오기
        int M = Integer.parseInt(br.readLine().trim());
        StringTokenizer seqC =  new StringTokenizer(br.readLine());

        //  배열 C Queue 에 삽입 후 poll 값 저장
        for(int i = 0; i < M; i++){
            queue.add(Integer.parseInt(seqC.nextToken()));
            sb.append(queue.poll()).append(" ");
        }

        System.out.print(sb);

    }
}