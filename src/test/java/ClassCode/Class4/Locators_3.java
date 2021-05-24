package Class4;

public class Locators_3 {

    /**
     * <tag1 attr1="value1" attr2="value2" attr3="value3" attr4="value4">
     *     <tag1_1 id="abcd" data-text-id="unique data" attr3="value3" attr4="value4">     //tag[@data-text-id='unique data']/tag[text()='No Unique Text']/subTag[@attr='value1']
     *                                                                                  //tag[@data-text-id='unique data']//subTag[@attr='value1']
     *         <tag1_1_1>Not Unique Text
     *              <subTag attr1="value1" attr2="value2" attr3="value3" attr4="value4">Unique Text</tag1>
     *         </tag1_1_1>
     *         <tag1_1_2 attr1="value1" attr2="value2" attr3="value3" attr4="value4">Unique Text</tag1_1_2>
     *              <subTag1 attr1="value1" attr2="value2" attr3="value3" attr4="value4">Unique Text</subTag1>
     *
     *              //subTag1[text()='Unique Text']/following-sibling::subTag2[@attr1='value1']
     *
     *              <subTag2 attr1="value1" attr2="value2" attr3="value3" attr4="value4">Unique Text</subTag2>
     *                  <subTag3 attr1="value1" attr2="value2" attr3="value3" attr4="value4">Unique Text</subTag3>
     *
     *                  //subTag3[@attr1='value1']/ancestor::tag1_1_2[]
     *
     *         <tag1_1_3 attr1="value1" attr2="value2" attr3="value3" attr4="value4">Unique Text</tag1_1_3>
     *     </tag1_1>
     *     <tag1_2 attr1="value1" attr2="value2" attr3="value3" attr4="value4">
     *         <tag1_2_1 attr1="value1" attr2="value2">Unique Text</tag>
     *     </tag1_2>
     *     <tag1_3 attr1="value1" attr2="value2" attr3="value3" attr4="value4">
     *          <tag1_3_1 attr1="value1" attr2="value2" attr3="value3" attr4="value4"></tag>
     *     </tag1_3>
     * </tag1>
     *
     */

    /**
     * Advanced XPath (Indirect xpath):
     *
     * 1. Via parent/GrandParent tag
     * eg:
     *      //div[@id='header']//span[contains(text(), '˚F')]
     *      //div[@id='header']//div[contains(@class, 'selectric-units')]//span[contains(text(), '˚F')]
     *      //*[@id='header']//span[contains(text(), '˚F')]
     *
     * 2. Xpath Axes
     * 1. following-sibling
     * //tag[condition(s)]/following-sibling::tag2[condition(s)]
     * eg:
     * //*[text()='Mobile number or email']/following-sibling::input
     * //*[text()='Mobile number or email']/following-sibling::*
     *
     * 2. preceding-sibling
     * //tag[condition(s)]/preceding-sibling::tag2[condition(s)]
     *
     * 3. following
     * //tag[condition(s)]/following::tag2[condition(s)]
     *
     * 4. preceding
     * //tag[condition(s)]/preceding::tag2[condition(s)]
     *
     * 5. ancestor
     * //tag[condition(s)]/ancestor::tag2[condition(s)]
     *
     * 6. descendant
     * //tag[condition(s)]/descendant::tag2[condition(s)]
     *
     */

}

