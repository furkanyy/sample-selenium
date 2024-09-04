package automation.pages;

import automation.toolset.Actions;

public class TechPage {

    /**
     * UI components.
     */
    private static final String TECH_PAGE_URL = "https://www.lely.com/techdocs/";

    private static final String SEARCH_DROPDOWN = "select2-id_q-container";
    private static final String SEARCH_FIELD = "select2-search__field";
    private static final String LIST_CSS = "ul.item-list.search-results-list > li.item.item-with-image";


    /**
     * go to the tech page
     */
    public void getTechPage() {
        Actions.getURL(TECH_PAGE_URL);
    }

    /**
     * checks the tech page's presence
     */
    public void checkTechPage() {
        Actions.checkElementByID(SEARCH_DROPDOWN);
    }

    public void clickSearchButton() {
        Actions.clickElementByID(SEARCH_DROPDOWN);
    }

    public void searchLunaEUR() {
        Actions.searchDocument(SEARCH_FIELD, "LUNA EUR");
    }

    public void viewTheFirstDoc() {
        Actions.viewDoc();
    }

    public void downloadTheDoc() {
        Actions.downloadDoc();
    }

    public void verifyDoc() {
        Actions.verifyDoc();
    }

    public void switchToMainTab() {
        Actions.switchToMainTab();
    }

    public void checkDownloadedDoc() {

    }

}
