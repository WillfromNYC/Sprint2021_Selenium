package Class2;

public class WebElements_DOM {
    /**
     * Types of WebElements:
     *      Input box/field --> type [sendKeys("type this")] / clear [clear()]
     *      Buttons --> click
     *      Radio Buttons --> click [click()]
     *      CheckBox --> click
     *      Dropdown --> click
     *      hyperlinks (links) --> click
     *          text associated with a link is called linkText
     *      Alert
     *      Frames
     *
     */

    /**
     * DOM - Document Object Model
     *
     *
     * <tag1>       --> starting of tag1 (tag name cannot have spaces)
     *
     * </tag1>      --> closing of tag1
     *
     * <tag1 attr1="value1" attr2="value2" attr3 attr4="value of attr4"></tag1>
     *      attr1, attr2, attr3, attr4 --> attributes with tag1 (attribute names cannot have spaces)
     *      each attribute may or may not have value.
     *
     * <tag1 attr1 attr3 attr4="value of attr4">text with tag1</tag1>
     *      tag1 has text = "text with tag1"
     *
     *
     * <tag1 attr11="val1" attr12="val2" attr13>
     *     <tag2 attr21="valu3" attr22="22">
     *          text value
     *     </tag2>
     *     <tag3>
     *         my text value
     *     </tag3>
     *      unique text value
     * </tag1>
     *
     *
     * text with tag2 --> text value
     * text with tag3 --> my text value
     * text with tag1 --> unique text value
     *
     * tag1 (parent) , tag2 and tag3 are child of tag1
     * tag2 and tag3 are sibling
     *
     *
     * <tag1 attr1="value1" attr2="value2" attr3="value3" attr4="value4">
     *     <tag2 id="abcd" data-text-id="unique data" attr3="value3" attr4="value4">
     *         <tag3>Not Unique Text
     *              <subTag attr1="value1" attr2="value2" attr3="value3" attr4="value4">Unique Text</subTag>
     *         </tag3>
     *         <tag11 attr1="value1" attr2="value2" attr3="value3" attr4="value4">Unique Text</tag11>
     *         <tag21 attr1="value1" attr2="value2" attr3="value3" attr4="value4">Unique Text</tag21>
     *     </tag2>
     *     <tag4 attr1="value1" attr2="value2" attr3="value3" attr4="value4">
     *         <a attr1="value1" attr2="value2">Unique Text</tag>
     *     </tag4>
     *     <tag6 attr1="value1" attr2="value2" attr3="value3" attr4="value4">
     *          <tag7 attr1="value1" attr2="value2" attr3="value3" attr4="value4"></tag>
     *     </tag6>
     * </tag1>
     *
     * children of tag1 -> tag2, tag4 and tag6
     *
     * parent of subTag -> tag3
     *
     * siblings of subTag -> 0
     *
     * children of tag2 -> tag3, tag11 and tag21
     *
     * following-sibling (sibling-tags appearing in dom after tag)
     * following-sibling of tag11 -> 1 (tag21)
     *
     * preceding-sibling (sibling-tags appearing in dom before tag)
     * preceding-sibling of tag21 -> 2 (tag3, tag11)
     *
     * following (tags appearing in dom after the tag)
     * following of tag2 -> tag3, subTag, tag11, tag21, tag4, a, tag6, tag7
     *
     * descendant (tags in family chain appearing in dom after the tag)
     * descendant of tag2 -> tag3, subTag, tag11, tag21
     *
     * preceding (tags occurring in dom before the tag)
     * preceding of a -> tag4, tag21, tag11, subTag, tag3, tag2, tag1
     *
     * ancestor (tags in family chain appearing in dom before the tag)
     * ancestor of a -> tag4, tag1
     *
     */






}

