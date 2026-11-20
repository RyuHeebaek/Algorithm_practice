# Algorithm_practice

백준 · 프로그래머스 · SWEA · CodeTree에서 푼 문제를 한 저장소에 모았습니다.
플랫폼별 폴더로 나눠 두었고, 문제마다 코드와 풀이 메모(`README.md`)를 함께 둡니다.

## 폴더

| 폴더 | 플랫폼 | 구성 | 풀이 파일 |
| --- | --- | --- | ---: |
| [`백준/`](./백준/) | Baekjoon Online Judge | 난이도별 `Bronze` 17 · `Silver` 48 · `Gold` 11, `<번호>. <제목>` 문제 폴더 | 76 |
| [`프로그래머스/`](./프로그래머스/) | Programmers | 레벨별 `0` · `1` · `2` | 13 |
| [`SWEA/`](./SWEA/) | SW Expert Academy | `D1`~`D8`, `역량테스트`, 문서 `docs/`, 초안 `drafts/` | 68 |
| [`CodeTree/`](./CodeTree/) | CodeTree | `codeTree_Chap`, `codeTree_GapCheck`, `trail2` | 10 Java · 11 Python |

## 구조

```text
Algorithm_practice/
├── 백준/
│   ├── Bronze/  Silver/  Gold/
│   └── <번호>. <제목>/
│       ├── <제목>.java      # BaekjoonHub가 만든 풀이
│       └── README.md
├── 프로그래머스/
│   └── <레벨>/<번호>. <제목>/
├── SWEA/
│   ├── D1/ ~ D5/, D8/, 역량테스트/
│   ├── docs/                 # 병합·검증 기록
│   ├── drafts/               # 작성 중 초안 (.java.txt)
│   └── README.md             # SWEA 문제 목록과 난이도별 현황
└── CodeTree/
```

## 파일 이름 규칙

- 백준: `백준/<난이도>/<번호>. <제목>/<제목>.java`. 다른 저장소에서 옮겨 온 풀이는 `BOJ_<번호>_<이름>.java`(예: `BOJ_4485.java`, `BOJ_2931_GasPipe.java`)로 둡니다.
- SWEA: `SWEA_<문제번호>.java`, 같은 문제의 다른 풀이는 `_1`, `_2`, `_fastest` 접미사로 구분합니다.
- CodeTree: 가져온 폴더 구조와 파일명을 그대로 유지합니다.

## 실행

IntelliJ IDEA에서 저장소를 열고 실행할 파일의 `main` 메서드를 돌립니다. `package` 선언이 없는 파일이 많으므로 필요한 폴더를 소스 루트로 지정해 개별 실행하고, SWEA 제출 시에는 문제가 요구하는 클래스명에 맞춥니다.

## 히스토리

- 2026-11-20: `SWEA`, `CodeTree` 저장소를 `git subtree`로 이 저장소에 합쳤습니다. 두 저장소의 커밋 히스토리는 그대로 남아 있고, 원본 저장소는 건드리지 않았습니다.
- 2026-11-20: 흩어져 있던 백준 풀이를 `백준/` 폴더로 옮기고 `BaekJoon` · `BeakJoon` 표기를 `BOJ`로 통일했습니다.
