package com.allendowney.thinkdast;

import java.io.IOException;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Deque;
import java.util.List;

import org.jsoup.Connection;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.nodes.Node;
import org.jsoup.nodes.TextNode;
import org.jsoup.select.Elements;

public class WikiNodeExample {

    public static void main(String[] args) throws IOException {
        String url = "https://en.wikipedia.org/wiki/Java_(programming_language)";

        // 문서를 다운로드하고 파싱하기
        Connection conn = Jsoup.connect(url);
        Document doc = conn.get();

        // 내용을 선택하고 단락 추출하기
        Element content = doc.getElementById("mw-content-text");

        // TODO: avoid selecting paragraphs from sidebars and boxouts
        Elements paras = content.select("p");
        Element firstPara = paras.get(0);

        recursiveDFS(firstPara);
        System.out.println();

        iterativeDFS(firstPara);
        System.out.println();

        Iterable<Node> iter = new WikiNodeIterable(firstPara);
        for (Node node : iter) {
            if (node instanceof TextNode) {
                System.out.print(node);
            }
        }
    }

    private static void iterativeDFS(Node root) {
        Deque<Node> stack = new ArrayDeque<>();
        stack.push(root);

        while (!stack.isEmpty()) {
            Node node = stack.pop();
            if (node instanceof TextNode) { // Node가 TextNode이면 내용 출력
                System.out.print(node);
            }

            List<Node> nodes = new ArrayList<>(node.childNodes());
            Collections.reverse(nodes);

            for (Node child : nodes) {
                stack.push(child);
            }
        }
    }

    private static void recursiveDFS(Node node) {
        if (node instanceof TextNode) { // Node가 TextNode이면 내용 출력
            System.out.print(node);
        }
        for (Node child : node.childNodes()) {
            recursiveDFS(child);
        }
    }
}
