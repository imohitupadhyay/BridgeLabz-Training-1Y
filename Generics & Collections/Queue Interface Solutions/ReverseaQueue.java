public static void reverseQueue(Queue<Integer> queue) {
    Stack<Integer> stack = new Stack<>();
    while (!queue.isEmpty()) stack.push(queue.remove());
    while (!stack.isEmpty()) queue.add(stack.pop());
}