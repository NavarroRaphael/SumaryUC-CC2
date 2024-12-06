public class HistoryNode {
    String page; // The page URL
    HistoryNode prev; // Previous page in the history
    HistoryNode next; // Next page in the history

    public HistoryNode(String page) {
        this.page = page;
        this.prev = null;
        this.next = null;
    }
}
// Browser History class
class BrowserHistory {
    private HistoryNode currentPage; // Current page in the history
    private HistoryNode head; // Head of the history list
    private HistoryNode tail; // Tail of the history list

    public BrowserHistory() {
        currentPage = null;
        head = null;
        tail = null;
    }
   // Visit a new page
   public void visitPage(String page) {
    // If we're not at the tail, clear the forward history
    if (currentPage != null && currentPage.next != null) {
        currentPage.next = null; // Remove all forward history
    }

    // Create a new node for the page
    HistoryNode newPage = new HistoryNode(page);

    // If there's no current page, the new page is the first page
    if (currentPage == null) {
        head = tail = newPage;
    } else {
        // Link the new page to the current page
        currentPage.next = newPage;
        newPage.prev = currentPage;
        tail = newPage; // The new page becomes the tail of the list
    }

    currentPage = newPage; // Now the current page is the new one
}

// Go back to the previous page
public void goBack() {
    if (currentPage != null && currentPage.prev != null) {
        currentPage = currentPage.prev;
        System.out.println("Going back to: " + currentPage.page);
    } else {
        System.out.println("No previous page.");
    }
}

// Go forward to the next page
public void goForward() {
    if (currentPage != null && currentPage.next != null) {
        currentPage = currentPage.next;
        System.out.println("Going forward to: " + currentPage.page);
    } else {
        System.out.println("No next page.");
    }
}

// Display the current page
public void currentPage() {
    if (currentPage != null) {
        System.out.println("Current page: " + currentPage.page);
    } else {
        System.out.println("No current page.");
    }
}
}

// Main class to test the BrowserHistory
public class BrowserHistoryDemo {
public static void main(String[] args) {
    BrowserHistory history = new BrowserHistory();

    // Visiting pages
    history.visitPage("google.com");
    history.visitPage("yahoo.com");
    history.visitPage("stackoverflow.com");
    
    // Go back and forward in history
    history.goBack(); // Should go to yahoo.com
    history.goBack(); // Should go to google.com
    history.goForward(); // Should go to yahoo.com
    history.goForward(); // Should go to stackoverflow.com
    
    // Visit a new page and test clearing forward history
    history.visitPage("github.com"); // Should clear the forward history
    history.goBack(); // Should go to stackoverflow.com
    history.goForward(); // Should go to github.com
}
}