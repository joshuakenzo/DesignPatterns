<%@ page isErrorPage="true" %>
<%@ page language="java" %>
<%@ taglib uri="struts-bean.tld" prefix="bean"%>
<%@ taglib uri="struts-html.tld" prefix="html"%>
<%@ taglib uri="struts-logic.tld" prefix="logic"%>
<%@ taglib uri="telaprocessual.tld" prefix="tela"%>
<%@ taglib uri="struts-tiles.tld" prefix="tiles" %>
<%@ taglib uri="c.tld" prefix="c" %>

<table border="0" cellpadding="0" cellspacing="0">

  <tr>
    <td valign=top align="center" width="100%"><br>
    
      <table border="0" cellpadding="0" cellspacing="0" width="363"  height="0">
      
        <tr class="fundo_titulo_azul">
		
          <td align="left" valign="bottom" width="11"></td>
          <td align="center" colspan="3" valign="center" class="letras_branco_bold">
            <bean:message key="login.title"/>
          </td>
          <td align="right" valign="top" width="17"></td>
        </tr>

        <tr>
          <td colspan="5" height="2"><html:img alt="" border="0" height="2" page="<%=request.getContextPath()%>/imagens/espacador.gif" width="1"/></td>
        </tr>
				
        <tr class="fundo_laranja">
          <td width="11">
            <html:img border="0" height="1" page="/Public_HTML/imagens/espacador.gif" width="1"/>
          </td>
          <td align="left" valign="top" width="202">
          
            <table border="0" cellpadding="5" cellspacing="1">

            <form action="j_security_check" method="post" name="form">

              <tr>
                <td width="180" class="letras_azul_bold_pequena">
                  Usuário:
                  <br>
                  <input class="campo_texto" size="27" maxLength="16" name="j_username" type="text"><br>
                  <br>Senha:
                  <br><input class="campo_texto" size="27" maxLength="8" name="j_password" type="password"><br><br>
                  <center>
                  <table border="0" cellpadding="0" cellspacing="0">
                    <tr>
                      <td>
                        <input class="botao_login" type=submit value="   Login   ">
                      </td>
                    </tr>
                  </table>
                  
                  </center>
                </td>
              </tr>

            <script language="javascript">
              document.form.j_username.focus();
            </script>

            </form>
            </table>

          </td>
          
          <td class="fundo_branco" width="1"><html:img border="0" height="1" page="<%=request.getContextPath()%>/imagens/espacador.gif" width="1"/></td>
         
          <td class="fundo_azul_claro">
          
            <table border="0" cellpadding="0" cellspacing="0" width="100%">
              <tr>
                <td align=center>
                  <html:img border="0" height="1" page="<%=request.getContextPath()%>/imagens/espacador.gif" width="5"/>
                </td>
                <td align=center class="letras_azul_bold_pequena">
                  <html:img altKey="icon.login.logosistema" border="0" pageKey="icon.login.logosistema.img" width="94" height="66"/><br>&nbsp;<br>
                  <span class="letras_azul_bold_pequena">
                    <bean:message key="icon.login.logosistema"/>
                  </span><br>
                </td>
              </tr>
            </table>
            
          </td>
          <td class="fundo_azul_claro" width="17">
            <html:img border="0" height="1" page="<%=request.getContextPath()%>/imagens/espacador.gif" width="1"/>
          </td>
        </tr>
        
        <tr>
          <td width="11" align=left valign=bottom class="fundo_laranja" > </td>
          <td width="202" class="fundo_laranja" >
            <html:img border="0" height="1" page="<%=request.getContextPath()%>/imagens/espacador.gif" width="1"/>
          </td>
          <td width="2" class="fundo_branco" >
            <html:img border="0" height="1" page="<%=request.getContextPath()%>/imagens/espacador.gif" width="1"/>
          </td>
          <td class="fundo_azul_claro" width="130" >
            <html:img border="0" height="1" page="<%=request.getContextPath()%>/imagens/espacador.gif" width="1"/>
          </td>
          <td align=right class="fundo_azul_claro" valign=bottom width="17"></td>
        </tr>
        
      </table>
      
    </td>
  </tr>
</table>

</center>
<br><br><br>

<table cellSpacing="0" cellPadding="0" width="100%" border="0">
  <tr>
    <td class="pagina_titulo" align="center" width="100%">&nbsp;
      
    </td>
  </tr>
</table>