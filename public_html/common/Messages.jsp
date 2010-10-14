<%@ taglib uri="struts-bean.tld" prefix="bean" %>
<%@ taglib uri="struts-html.tld" prefix="html" %>
<%@ taglib uri="struts-logic.tld" prefix="logic" %>

<TABLE width="100%" border=0>

  <%-- Messagens de Erro --%>
  
  <logic:messagesPresent>
  <TR>
    <TD width="20">&nbsp;&nbsp;</TD>
    <TD valign="center">
      <html:img pageKey="icon.warning.img" altKey="icon.warning"/>
    </TD>
    <TD width="20">&nbsp;&nbsp;</TD>
    <TD class="texto_vermelho" align="left" width="100%">
      <br>
        <div align="justify">
          <bean:message key="errors.header"/>
          <ul>
            <html:messages id="error">
              <li><bean:write name="error"/></li>
            </html:messages>
          </ul>
       </div>
    </td>
    <TD width="20">&nbsp;&nbsp;</TD>
  </TR>
  
  </logic:messagesPresent>

  <%-- Messages de Sucesso --%>
  <logic:messagesPresent message="true">

  <TR>
    <TD width="20">&nbsp;&nbsp;</TD>
    <TD valign="center">
      <html:img pageKey="icon.information.img" altKey="icon.information"/>
    </TD>
    <TD width="20">&nbsp;&nbsp;</TD>
    <TD class="texto_vermelho" align="left" width="100%">
      <br>
      <div align="justify">
        <html:messages id="message" message="true">
          <bean:write name="message" filter="false"/><br/>
        </html:messages>
      </div>
    </td>
    <TD width="20">&nbsp;&nbsp;</TD>
  </TR>

  </logic:messagesPresent>

</TABLE>