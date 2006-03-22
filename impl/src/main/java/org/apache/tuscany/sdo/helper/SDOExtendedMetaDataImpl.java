package org.apache.tuscany.sdo.helper;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.StringTokenizer;

import org.apache.tuscany.sdo.SDOExtendedMetaData;
import org.eclipse.emf.ecore.EAnnotation;
import org.eclipse.emf.ecore.EModelElement;
import org.eclipse.emf.ecore.EPackage.Registry;
import org.eclipse.emf.ecore.util.BasicExtendedMetaData;

public class SDOExtendedMetaDataImpl 
  extends BasicExtendedMetaData 
  implements SDOExtendedMetaData {

  
  
  public SDOExtendedMetaDataImpl() {
    super();
  }

  public SDOExtendedMetaDataImpl(Registry registry) {
    super(registry);
  }

  public SDOExtendedMetaDataImpl(String annotationURI, Registry registry, Map annotationMap) {
    super(annotationURI, registry, annotationMap);
  }

  public SDOExtendedMetaDataImpl(String annotationURI, Registry registry) {
    super(annotationURI, registry);
  }

  /**
   * Returns the listing of alias names as specified by the sdo:aliasNames
   * property.
   */
  public List getAliasNames(EModelElement modelElement) {
    EAnnotation eAnnotation = getAnnotation(modelElement, false);
    List<String> list = null;
    if (eAnnotation != null) {
      String aliasNames = (String)eAnnotation.getDetails().get("aliasNames");
      if (aliasNames != null) {
        list = new ArrayList<String>();
        StringTokenizer st = new StringTokenizer(aliasNames, " ");
        while (st.hasMoreTokens()) {
          String t = st.nextToken();
          list.add(t);
        }
      }
    }
    return list;
  }

  
  public void setAliasNames(EModelElement modelElement, List aliasNames) {
    if (aliasNames == null || aliasNames.isEmpty()) {
      setAliasNames(modelElement, (String)null);
    } else {
      StringBuffer buf = new StringBuffer();
      for (int n = 0; n < aliasNames.size(); n++) {
        String name = (String) aliasNames.get(n);
        buf.append(name);
        buf.append(" ");
      }
      setAliasNames(modelElement, buf.toString());
    }
  }
  
  /**
   * Adds an alias name per sdo:aliasName
   */
  public void setAliasNames(EModelElement modelElement, String aliasNames) {
    EAnnotation eAnnotation = getAnnotation(modelElement, true);
    eAnnotation.getDetails().put("aliasNames", aliasNames);
  }
  
}
