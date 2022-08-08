public ListNode mergeKLists(ListNode[] lists) {

		List<Integer> commonList = new ArrayList<>();

		for (ListNode listNode : lists) {
			while (listNode != null) {
				commonList.add(listNode.val);
				listNode = listNode.next;
			}
		}

		commonList = commonList.stream().sorted().toList();

		ListNode firstNode = null;
		ListNode previousNode = null;

		for (Integer value : commonList) {

			ListNode node = new ListNode(value);

			if (previousNode != null)
				previousNode.next = node;
			previousNode = node;

			if (firstNode == null)
				firstNode = node;

		}

		return firstNode;

	}
