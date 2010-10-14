<%@ taglib uri="struts-tiles.tld" prefix="tiles" %>
<%@ taglib uri="struts-html.tld" prefix="html" %>
<%@ taglib uri="struts-logic.tld" prefix="logic" %>

<%--
<tiles:insert definition="processualLayout" flush="true">
  <tiles:put name="titleKey" value="aplicacao.title"/>
  <tiles:put name="content" value="/IndexBody.jsp"/>
</tiles:insert>
--%>

<logic:redirect page="/localizarcontribuinte.do" />