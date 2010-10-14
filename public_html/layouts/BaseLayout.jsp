<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN"
	"http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">

<%-- Include common set of tag library declarations for each layout --%>
<%@ taglib uri="struts-bean.tld" prefix="bean" %>
<%@ taglib uri="struts-html.tld" prefix="html" %>
<%@ taglib uri="struts-logic.tld" prefix="logic" %>
<%@ taglib uri="struts-tiles.tld" prefix="tiles" %>

<%@ taglib uri="c.tld" prefix="c" %>

<html:html xhtml="true" locale="true">

<head>
        
    <%-- Push tiles attributes in request context --%>
    <tiles:importAttribute name="titleKey" scope="request" ignore="true" />
    <tiles:importAttribute name="windowTitleKey" scope="request" ignore="true" />
    
    <title>
        <bean:message name="windowTitleKey"/>
    </title>
		
    <%-- Get Javascript List --%>
    <tiles:useAttribute id="scriptList" name="scripts" 
        classname="java.util.List" ignore="true"/>
        
    <c:forEach var="js" items="${scriptList}">
        <script type="text/javascript"
            src="<c:url value="${js}"/>"></script>
    </c:forEach>
    
    <%-- Get List of Stylesheets --%>
    <tiles:useAttribute id="styleList" name="styles" 
        classname="java.util.List" ignore="true"/>
    
    <c:forEach var="css" items="${styleList}">
        <link rel="stylesheet" type="text/css" media="all" 
            href="<c:url value="${css}"/>" /> 
    </c:forEach>
    
</head>

<body leftMargin="0" topMargin="0" marginheight="0" marginwidth="0">
    
<!-- Header -->
<tiles:insert attribute="header" />

<!-- Message -->
<tiles:insert attribute="messages" />

<!-- Content -->
<tiles:insert attribute="content" />

</body>
</html:html>

