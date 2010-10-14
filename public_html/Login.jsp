<%@ taglib uri="struts-tiles.tld" prefix="tiles" %>

<tiles:insert definition="processualLayout" flush="true">
  <tiles:put name="titleKey" value="aplicacao.title"/>
  <tiles:put name="content" value="/LoginBody.jsp"/>
</tiles:insert>