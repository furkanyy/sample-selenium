package pages;

import toolset.Actions;

public class DocumentationPage {

    /**
     * UI components.
     */
    private static final String SEARCH_BAR = ".DocSearch-Button-Placeholder";
    private static final String SEARCH_BAR_INPUT = ".DocSearch-Input";



    /**
     * verify the documentation page's presence
     */
    public void verifyDocumentationPage() {
        Actions.verifyElement(SEARCH_BAR);
    }

    /**
     * verify the documentation page's presence
     */
    public void searchInDocumentation(String word) {
        Actions.clickField(SEARCH_BAR);
        Actions.fillField(SEARCH_BAR_INPUT, word);
        Actions.pressEnter(SEARCH_BAR_INPUT);
    }

    public void verifyResult(String word) {
        Actions.verifyResults(word);
    }


}
