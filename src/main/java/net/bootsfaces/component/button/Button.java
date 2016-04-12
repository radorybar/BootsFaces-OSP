/**
 *  Copyright 2014-15 by Riccardo Massera (TheCoder4.Eu) and Stephan Rauh (http://www.beyondjava.net).
 *  
 *  This file is part of BootsFaces.
 *  
 *  BootsFaces is free software: you can redistribute it and/or modify
 *  it under the terms of the GNU Lesser General Public License as published by
 *  the Free Software Foundation, either version 3 of the License, or
 *  (at your option) any later version.
 *
 *  BootsFaces is distributed in the hope that it will be useful,
 *  but WITHOUT ANY WARRANTY; without even the implied warranty of
 *  MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 *  GNU Lesser General Public License for more details.
 *
 *  You should have received a copy of the GNU Lesser General Public License
 *  along with BootsFaces. If not, see <http://www.gnu.org/licenses/>.
 */

package net.bootsfaces.component.button;

import javax.el.ValueExpression;
import javax.faces.component.FacesComponent;
import javax.faces.component.html.HtmlOutcomeTargetButton;

import net.bootsfaces.listeners.AddResourcesListener;
import net.bootsfaces.render.Tooltip;
import net.bootsfaces.utils.BsfUtils;


/** This class holds the attributes of &lt;b:button /&gt;. */
@FacesComponent("net.bootsfaces.component.button.Button")
public class Button extends HtmlOutcomeTargetButton  implements net.bootsfaces.render.IHasTooltip  {
	
	public static final String COMPONENT_TYPE = "net.bootsfaces.component.button.Button";
	
	public static final String COMPONENT_FAMILY = "net.bootsfaces.component";
	
	public static final String DEFAULT_RENDERER = "net.bootsfaces.component.button.Button";
	
	public Button() {
		setRendererType(DEFAULT_RENDERER);
		
		AddResourcesListener.addThemedCSSResource("core.css");
		AddResourcesListener.addThemedCSSResource("tooltip.css");
		Tooltip.addResourceFile();
	}
	
	public String getFamily() {
		return COMPONENT_FAMILY;
	}
	
	/** 
	 * Manage EL-expression for snake-case attributes
	 */
	public void setValueExpression(String name, ValueExpression binding) {
		name = BsfUtils.snakeCaseToCamelCase(name);
		super.setValueExpression(name, binding);
	}		
	
    protected enum PropertyKeys {
		accesskey,
		binding,
		dir,
		disabled,
		dismiss,
		fragment,
		icon,
		iconAlign,
		iconAwesome,
		immediate,
		lang,
		look,
		onblur,
		onchange,
		onclick,
		ondblclick,
		onfocus,
		onkeydown,
		onkeypress,
		onkeyup,
		onmousedown,
		onmousemove,
		onmouseout,
		onmouseover,
		onmouseup,
		onselect,
		outcome,
		size,
		style,
		styleClass,
		tabindex,
		title,
		tooltip,
		tooltipContainer,
		tooltipDelay,
		tooltipDelayHide,
		tooltipDelayShow,
		tooltipPosition
		;
        String toString;

        PropertyKeys(String toString) {
            this.toString = toString;
        }

        PropertyKeys() {}

        public String toString() {
            return ((this.toString != null) ? this.toString : super.toString());
        }
    }
	

	/**
	 * Access key to transfer focus to the input element. <P>
	 * @return Returns the value of the attribute, or null, if it hasn't been set by the JSF file.
	 */
	public String getAccesskey() {
		String value = (String)getStateHelper().eval(PropertyKeys.accesskey);
		return  value;
	}
	
	/**
	 * Access key to transfer focus to the input element. <P>
	 * Usually this method is called internally by the JSF engine.
	 */
	public void setAccesskey(String _accesskey) {
	    getStateHelper().put(PropertyKeys.accesskey, _accesskey);
    }
	

	/**
	 * An EL expression referring to a server side UIComponent instance in a backing bean. <P>
	 * @return Returns the value of the attribute, or null, if it hasn't been set by the JSF file.
	 */
	public javax.faces.component.UIComponent getBinding() {
		javax.faces.component.UIComponent value = (javax.faces.component.UIComponent)getStateHelper().eval(PropertyKeys.binding);
		return  value;
	}
	
	/**
	 * An EL expression referring to a server side UIComponent instance in a backing bean. <P>
	 * Usually this method is called internally by the JSF engine.
	 */
	public void setBinding(javax.faces.component.UIComponent _binding) {
	    getStateHelper().put(PropertyKeys.binding, _binding);
    }
	

	/**
	 * Direction indication for text that does not inherit directionality. Legal values: ltr (Default. Left-to-right text direction), rtl (Right-to-left text direction) and auto (let the browser figure out the direction of your alphabet, based on the page content). <P>
	 * @return Returns the value of the attribute, or null, if it hasn't been set by the JSF file.
	 */
	public String getDir() {
		String value = (String)getStateHelper().eval(PropertyKeys.dir);
		return  value;
	}
	
	/**
	 * Direction indication for text that does not inherit directionality. Legal values: ltr (Default. Left-to-right text direction), rtl (Right-to-left text direction) and auto (let the browser figure out the direction of your alphabet, based on the page content). <P>
	 * Usually this method is called internally by the JSF engine.
	 */
	public void setDir(String _dir) {
	    getStateHelper().put(PropertyKeys.dir, _dir);
    }
	

	/**
	 * Boolean value to specify if the button is disabled. <P>
	 * @return Returns the value of the attribute, or null, if it hasn't been set by the JSF file.
	 */
	public boolean isDisabled() {
		Boolean value = (Boolean)getStateHelper().eval(PropertyKeys.disabled, false);
		return (boolean) value;
	}
	
	/**
	 * Boolean value to specify if the button is disabled. <P>
	 * Usually this method is called internally by the JSF engine.
	 */
	public void setDisabled(boolean _disabled) {
	    getStateHelper().put(PropertyKeys.disabled, _disabled);
    }
	

	/**
	 * This attribute is mapped to the HTML5 data-dismiss custom attribute. <P>
	 * @return Returns the value of the attribute, or null, if it hasn't been set by the JSF file.
	 */
	public String getDismiss() {
		String value = (String)getStateHelper().eval(PropertyKeys.dismiss);
		return  value;
	}
	
	/**
	 * This attribute is mapped to the HTML5 data-dismiss custom attribute. <P>
	 * Usually this method is called internally by the JSF engine.
	 */
	public void setDismiss(String _dismiss) {
	    getStateHelper().put(PropertyKeys.dismiss, _dismiss);
    }
	

	/**
	 * The fragment  that is to be appended to the target URL. The # separator is applied automatically and needs not be included. <P>
	 * @return Returns the value of the attribute, or null, if it hasn't been set by the JSF file.
	 */
	public String getFragment() {
		String value = (String)getStateHelper().eval(PropertyKeys.fragment);
		return  value;
	}
	
	/**
	 * The fragment  that is to be appended to the target URL. The # separator is applied automatically and needs not be included. <P>
	 * Usually this method is called internally by the JSF engine.
	 */
	public void setFragment(String _fragment) {
	    getStateHelper().put(PropertyKeys.fragment, _fragment);
    }
	

	/**
	 * Button Icon, can be one of the Bootstrap icon names. Alignment can be specified with icon-align attribute. <P>
	 * @return Returns the value of the attribute, or null, if it hasn't been set by the JSF file.
	 */
	public String getIcon() {
		String value = (String)getStateHelper().eval(PropertyKeys.icon);
		return  value;
	}
	
	/**
	 * Button Icon, can be one of the Bootstrap icon names. Alignment can be specified with icon-align attribute. <P>
	 * Usually this method is called internally by the JSF engine.
	 */
	public void setIcon(String _icon) {
	    getStateHelper().put(PropertyKeys.icon, _icon);
    }
	

	/**
	 * Alignment can be right or left. <P>
	 * @return Returns the value of the attribute, or null, if it hasn't been set by the JSF file.
	 */
	public String getIconAlign() {
		String value = (String)getStateHelper().eval(PropertyKeys.iconAlign);
		return  value;
	}
	
	/**
	 * Alignment can be right or left. <P>
	 * Usually this method is called internally by the JSF engine.
	 */
	public void setIconAlign(String _iconAlign) {
	    getStateHelper().put(PropertyKeys.iconAlign, _iconAlign);
    }
	

	/**
	 * Font Awesome Icon to show in this Button, can be one of the Font Awesome icon names. Alignment can be specified with the icon-align attribute. <P>
	 * @return Returns the value of the attribute, or null, if it hasn't been set by the JSF file.
	 */
	public String getIconAwesome() {
		String value = (String)getStateHelper().eval(PropertyKeys.iconAwesome);
		return  value;
	}
	
	/**
	 * Font Awesome Icon to show in this Button, can be one of the Font Awesome icon names. Alignment can be specified with the icon-align attribute. <P>
	 * Usually this method is called internally by the JSF engine.
	 */
	public void setIconAwesome(String _iconAwesome) {
	    getStateHelper().put(PropertyKeys.iconAwesome, _iconAwesome);
    }
	

	/**
	 * Flag indicating that, if this component is activated by the user, notifications should be delivered to interested listeners and actions immediately (that is, during Apply Request Values phase) rather than waiting until Invoke Application phase. Default is false. <P>
	 * @return Returns the value of the attribute, or null, if it hasn't been set by the JSF file.
	 */
	public boolean isImmediate() {
		Boolean value = (Boolean)getStateHelper().eval(PropertyKeys.immediate, false);
		return (boolean) value;
	}
	
	/**
	 * Flag indicating that, if this component is activated by the user, notifications should be delivered to interested listeners and actions immediately (that is, during Apply Request Values phase) rather than waiting until Invoke Application phase. Default is false. <P>
	 * Usually this method is called internally by the JSF engine.
	 */
	public void setImmediate(boolean _immediate) {
	    getStateHelper().put(PropertyKeys.immediate, _immediate);
    }
	

	/**
	 * Code describing the language used in the generated markup for this component. <P>
	 * @return Returns the value of the attribute, or null, if it hasn't been set by the JSF file.
	 */
	public String getLang() {
		String value = (String)getStateHelper().eval(PropertyKeys.lang);
		return  value;
	}
	
	/**
	 * Code describing the language used in the generated markup for this component. <P>
	 * Usually this method is called internally by the JSF engine.
	 */
	public void setLang(String _lang) {
	    getStateHelper().put(PropertyKeys.lang, _lang);
    }
	

	/**
	 * Look of the Button, can be primary, block, info, success, warning, important, error, inverse. If not specified, Standard gray button with gradient is rendered. <P>
	 * @return Returns the value of the attribute, or null, if it hasn't been set by the JSF file.
	 */
	public String getLook() {
		String value = (String)getStateHelper().eval(PropertyKeys.look);
		return  value;
	}
	
	/**
	 * Look of the Button, can be primary, block, info, success, warning, important, error, inverse. If not specified, Standard gray button with gradient is rendered. <P>
	 * Usually this method is called internally by the JSF engine.
	 */
	public void setLook(String _look) {
	    getStateHelper().put(PropertyKeys.look, _look);
    }
	

	/**
	 * Client side callback to execute when input element loses focus. <P>
	 * @return Returns the value of the attribute, or null, if it hasn't been set by the JSF file.
	 */
	public String getOnblur() {
		String value = (String)getStateHelper().eval(PropertyKeys.onblur);
		return  value;
	}
	
	/**
	 * Client side callback to execute when input element loses focus. <P>
	 * Usually this method is called internally by the JSF engine.
	 */
	public void setOnblur(String _onblur) {
	    getStateHelper().put(PropertyKeys.onblur, _onblur);
    }
	

	/**
	 * Client side callback to execute when input element loses focus and its value has been modified since gaining focus. <P>
	 * @return Returns the value of the attribute, or null, if it hasn't been set by the JSF file.
	 */
	public String getOnchange() {
		String value = (String)getStateHelper().eval(PropertyKeys.onchange);
		return  value;
	}
	
	/**
	 * Client side callback to execute when input element loses focus and its value has been modified since gaining focus. <P>
	 * Usually this method is called internally by the JSF engine.
	 */
	public void setOnchange(String _onchange) {
	    getStateHelper().put(PropertyKeys.onchange, _onchange);
    }
	

	/**
	 * The onclick attribute. <P>
	 * @return Returns the value of the attribute, or null, if it hasn't been set by the JSF file.
	 */
	public String getOnclick() {
		String value = (String)getStateHelper().eval(PropertyKeys.onclick);
		return  value;
	}
	
	/**
	 * The onclick attribute. <P>
	 * Usually this method is called internally by the JSF engine.
	 */
	public void setOnclick(String _onclick) {
	    getStateHelper().put(PropertyKeys.onclick, _onclick);
    }
	

	/**
	 * Client side callback to execute when input element is double clicked. <P>
	 * @return Returns the value of the attribute, or null, if it hasn't been set by the JSF file.
	 */
	public String getOndblclick() {
		String value = (String)getStateHelper().eval(PropertyKeys.ondblclick);
		return  value;
	}
	
	/**
	 * Client side callback to execute when input element is double clicked. <P>
	 * Usually this method is called internally by the JSF engine.
	 */
	public void setOndblclick(String _ondblclick) {
	    getStateHelper().put(PropertyKeys.ondblclick, _ondblclick);
    }
	

	/**
	 * Client side callback to execute when input element receives focus. <P>
	 * @return Returns the value of the attribute, or null, if it hasn't been set by the JSF file.
	 */
	public String getOnfocus() {
		String value = (String)getStateHelper().eval(PropertyKeys.onfocus);
		return  value;
	}
	
	/**
	 * Client side callback to execute when input element receives focus. <P>
	 * Usually this method is called internally by the JSF engine.
	 */
	public void setOnfocus(String _onfocus) {
	    getStateHelper().put(PropertyKeys.onfocus, _onfocus);
    }
	

	/**
	 * Client side callback to execute when a key is pressed down over input element. <P>
	 * @return Returns the value of the attribute, or null, if it hasn't been set by the JSF file.
	 */
	public String getOnkeydown() {
		String value = (String)getStateHelper().eval(PropertyKeys.onkeydown);
		return  value;
	}
	
	/**
	 * Client side callback to execute when a key is pressed down over input element. <P>
	 * Usually this method is called internally by the JSF engine.
	 */
	public void setOnkeydown(String _onkeydown) {
	    getStateHelper().put(PropertyKeys.onkeydown, _onkeydown);
    }
	

	/**
	 * Client side callback to execute when a key is pressed and released over input element. <P>
	 * @return Returns the value of the attribute, or null, if it hasn't been set by the JSF file.
	 */
	public String getOnkeypress() {
		String value = (String)getStateHelper().eval(PropertyKeys.onkeypress);
		return  value;
	}
	
	/**
	 * Client side callback to execute when a key is pressed and released over input element. <P>
	 * Usually this method is called internally by the JSF engine.
	 */
	public void setOnkeypress(String _onkeypress) {
	    getStateHelper().put(PropertyKeys.onkeypress, _onkeypress);
    }
	

	/**
	 * Client side callback to execute when a key is released over input element. <P>
	 * @return Returns the value of the attribute, or null, if it hasn't been set by the JSF file.
	 */
	public String getOnkeyup() {
		String value = (String)getStateHelper().eval(PropertyKeys.onkeyup);
		return  value;
	}
	
	/**
	 * Client side callback to execute when a key is released over input element. <P>
	 * Usually this method is called internally by the JSF engine.
	 */
	public void setOnkeyup(String _onkeyup) {
	    getStateHelper().put(PropertyKeys.onkeyup, _onkeyup);
    }
	

	/**
	 * Client side callback to execute when a pointer input element is pressed down over input element. <P>
	 * @return Returns the value of the attribute, or null, if it hasn't been set by the JSF file.
	 */
	public String getOnmousedown() {
		String value = (String)getStateHelper().eval(PropertyKeys.onmousedown);
		return  value;
	}
	
	/**
	 * Client side callback to execute when a pointer input element is pressed down over input element. <P>
	 * Usually this method is called internally by the JSF engine.
	 */
	public void setOnmousedown(String _onmousedown) {
	    getStateHelper().put(PropertyKeys.onmousedown, _onmousedown);
    }
	

	/**
	 * Client side callback to execute when a pointer input element is moved within input element. <P>
	 * @return Returns the value of the attribute, or null, if it hasn't been set by the JSF file.
	 */
	public String getOnmousemove() {
		String value = (String)getStateHelper().eval(PropertyKeys.onmousemove);
		return  value;
	}
	
	/**
	 * Client side callback to execute when a pointer input element is moved within input element. <P>
	 * Usually this method is called internally by the JSF engine.
	 */
	public void setOnmousemove(String _onmousemove) {
	    getStateHelper().put(PropertyKeys.onmousemove, _onmousemove);
    }
	

	/**
	 * Client side callback to execute when a pointer input element is moved away from input element. <P>
	 * @return Returns the value of the attribute, or null, if it hasn't been set by the JSF file.
	 */
	public String getOnmouseout() {
		String value = (String)getStateHelper().eval(PropertyKeys.onmouseout);
		return  value;
	}
	
	/**
	 * Client side callback to execute when a pointer input element is moved away from input element. <P>
	 * Usually this method is called internally by the JSF engine.
	 */
	public void setOnmouseout(String _onmouseout) {
	    getStateHelper().put(PropertyKeys.onmouseout, _onmouseout);
    }
	

	/**
	 * Client side callback to execute when a pointer input element is moved onto input element. <P>
	 * @return Returns the value of the attribute, or null, if it hasn't been set by the JSF file.
	 */
	public String getOnmouseover() {
		String value = (String)getStateHelper().eval(PropertyKeys.onmouseover);
		return  value;
	}
	
	/**
	 * Client side callback to execute when a pointer input element is moved onto input element. <P>
	 * Usually this method is called internally by the JSF engine.
	 */
	public void setOnmouseover(String _onmouseover) {
	    getStateHelper().put(PropertyKeys.onmouseover, _onmouseover);
    }
	

	/**
	 * Client side callback to execute when a pointer input element is released over input element. <P>
	 * @return Returns the value of the attribute, or null, if it hasn't been set by the JSF file.
	 */
	public String getOnmouseup() {
		String value = (String)getStateHelper().eval(PropertyKeys.onmouseup);
		return  value;
	}
	
	/**
	 * Client side callback to execute when a pointer input element is released over input element. <P>
	 * Usually this method is called internally by the JSF engine.
	 */
	public void setOnmouseup(String _onmouseup) {
	    getStateHelper().put(PropertyKeys.onmouseup, _onmouseup);
    }
	

	/**
	 * Client side callback to execute when text within input element is selected by user. <P>
	 * @return Returns the value of the attribute, or null, if it hasn't been set by the JSF file.
	 */
	public String getOnselect() {
		String value = (String)getStateHelper().eval(PropertyKeys.onselect);
		return  value;
	}
	
	/**
	 * Client side callback to execute when text within input element is selected by user. <P>
	 * Usually this method is called internally by the JSF engine.
	 */
	public void setOnselect(String _onselect) {
	    getStateHelper().put(PropertyKeys.onselect, _onselect);
    }
	

	/**
	 * The outcome to navigate to. <P>
	 * @return Returns the value of the attribute, or null, if it hasn't been set by the JSF file.
	 */
	public String getOutcome() {
		String value = (String)getStateHelper().eval(PropertyKeys.outcome);
		return  value;
	}
	
	/**
	 * The outcome to navigate to. <P>
	 * Usually this method is called internally by the JSF engine.
	 */
	public void setOutcome(String _outcome) {
	    getStateHelper().put(PropertyKeys.outcome, _outcome);
    }
	

	/**
	 * Size of the Button, can be large, small, mini. If not specified, Standard size button is rendered. <P>
	 * @return Returns the value of the attribute, or null, if it hasn't been set by the JSF file.
	 */
	public String getSize() {
		String value = (String)getStateHelper().eval(PropertyKeys.size);
		return  value;
	}
	
	/**
	 * Size of the Button, can be large, small, mini. If not specified, Standard size button is rendered. <P>
	 * Usually this method is called internally by the JSF engine.
	 */
	public void setSize(String _size) {
	    getStateHelper().put(PropertyKeys.size, _size);
    }
	

	/**
	 * Inline style of the input element. <P>
	 * @return Returns the value of the attribute, or null, if it hasn't been set by the JSF file.
	 */
	public String getStyle() {
		String value = (String)getStateHelper().eval(PropertyKeys.style);
		return  value;
	}
	
	/**
	 * Inline style of the input element. <P>
	 * Usually this method is called internally by the JSF engine.
	 */
	public void setStyle(String _style) {
	    getStateHelper().put(PropertyKeys.style, _style);
    }
	

	/**
	 * Style class of this element. <P>
	 * @return Returns the value of the attribute, or null, if it hasn't been set by the JSF file.
	 */
	public String getStyleClass() {
		String value = (String)getStateHelper().eval(PropertyKeys.styleClass);
		return  value;
	}
	
	/**
	 * Style class of this element. <P>
	 * Usually this method is called internally by the JSF engine.
	 */
	public void setStyleClass(String _styleClass) {
	    getStateHelper().put(PropertyKeys.styleClass, _styleClass);
    }
	

	/**
	 * Position of this element in the tabbing order for the current document.  This value must be an integer between 0 and 32767. <P>
	 * @return Returns the value of the attribute, or null, if it hasn't been set by the JSF file.
	 */
	public String getTabindex() {
		String value = (String)getStateHelper().eval(PropertyKeys.tabindex);
		return  value;
	}
	
	/**
	 * Position of this element in the tabbing order for the current document.  This value must be an integer between 0 and 32767. <P>
	 * Usually this method is called internally by the JSF engine.
	 */
	public void setTabindex(String _tabindex) {
	    getStateHelper().put(PropertyKeys.tabindex, _tabindex);
    }
	

	/**
	 * Advisory tooltip information. <P>
	 * @return Returns the value of the attribute, or null, if it hasn't been set by the JSF file.
	 */
	public String getTitle() {
		String value = (String)getStateHelper().eval(PropertyKeys.title);
		return  value;
	}
	
	/**
	 * Advisory tooltip information. <P>
	 * Usually this method is called internally by the JSF engine.
	 */
	public void setTitle(String _title) {
	    getStateHelper().put(PropertyKeys.title, _title);
    }
	

	/**
	 * The text of the tooltip. <P>
	 * @return Returns the value of the attribute, or null, if it hasn't been set by the JSF file.
	 */
	public String getTooltip() {
		String value = (String)getStateHelper().eval(PropertyKeys.tooltip);
		return  value;
	}
	
	/**
	 * The text of the tooltip. <P>
	 * Usually this method is called internally by the JSF engine.
	 */
	public void setTooltip(String _tooltip) {
	    getStateHelper().put(PropertyKeys.tooltip, _tooltip);
    }
	

	/**
	 * Where is the tooltip div generated? That's primarily a technical value that can be used to fix rendering errors in special cases. Also see data-container in the documentation of Bootstrap. The default value is body. <P>
	 * @return Returns the value of the attribute, or null, if it hasn't been set by the JSF file.
	 */
	public String getTooltipContainer() {
		String value = (String)getStateHelper().eval(PropertyKeys.tooltipContainer, "body");
		return  value;
	}
	
	/**
	 * Where is the tooltip div generated? That's primarily a technical value that can be used to fix rendering errors in special cases. Also see data-container in the documentation of Bootstrap. The default value is body. <P>
	 * Usually this method is called internally by the JSF engine.
	 */
	public void setTooltipContainer(String _tooltipContainer) {
	    getStateHelper().put(PropertyKeys.tooltipContainer, _tooltipContainer);
    }
	

	/**
	 * The tooltip is shown and hidden with a delay. This value is the delay in milliseconds. Defaults to 0 (no delay). <P>
	 * @return Returns the value of the attribute, or null, if it hasn't been set by the JSF file.
	 */
	public int getTooltipDelay() {
		Integer value = (Integer)getStateHelper().eval(PropertyKeys.tooltipDelay, 0);
		return (int) value;
	}
	
	/**
	 * The tooltip is shown and hidden with a delay. This value is the delay in milliseconds. Defaults to 0 (no delay). <P>
	 * Usually this method is called internally by the JSF engine.
	 */
	public void setTooltipDelay(int _tooltipDelay) {
	    getStateHelper().put(PropertyKeys.tooltipDelay, _tooltipDelay);
    }
	

	/**
	 * The tooltip is hidden with a delay. This value is the delay in milliseconds. Defaults to 0 (no delay). <P>
	 * @return Returns the value of the attribute, or null, if it hasn't been set by the JSF file.
	 */
	public int getTooltipDelayHide() {
		Integer value = (Integer)getStateHelper().eval(PropertyKeys.tooltipDelayHide, 0);
		return (int) value;
	}
	
	/**
	 * The tooltip is hidden with a delay. This value is the delay in milliseconds. Defaults to 0 (no delay). <P>
	 * Usually this method is called internally by the JSF engine.
	 */
	public void setTooltipDelayHide(int _tooltipDelayHide) {
	    getStateHelper().put(PropertyKeys.tooltipDelayHide, _tooltipDelayHide);
    }
	

	/**
	 * The tooltip is shown with a delay. This value is the delay in milliseconds. Defaults to 0 (no delay). <P>
	 * @return Returns the value of the attribute, or null, if it hasn't been set by the JSF file.
	 */
	public int getTooltipDelayShow() {
		Integer value = (Integer)getStateHelper().eval(PropertyKeys.tooltipDelayShow, 0);
		return (int) value;
	}
	
	/**
	 * The tooltip is shown with a delay. This value is the delay in milliseconds. Defaults to 0 (no delay). <P>
	 * Usually this method is called internally by the JSF engine.
	 */
	public void setTooltipDelayShow(int _tooltipDelayShow) {
	    getStateHelper().put(PropertyKeys.tooltipDelayShow, _tooltipDelayShow);
    }
	

	/**
	 * Where is the tooltip to be displayed? Possible values: "top", "bottom", "right", "left", "auto", "auto top", "auto bottom", "auto right" and "auto left". Default to "bottom". <P>
	 * @return Returns the value of the attribute, or null, if it hasn't been set by the JSF file.
	 */
	public String getTooltipPosition() {
		String value = (String)getStateHelper().eval(PropertyKeys.tooltipPosition);
		return  value;
	}
	
	/**
	 * Where is the tooltip to be displayed? Possible values: "top", "bottom", "right", "left", "auto", "auto top", "auto bottom", "auto right" and "auto left". Default to "bottom". <P>
	 * Usually this method is called internally by the JSF engine.
	 */
	public void setTooltipPosition(String _tooltipPosition) {
	    getStateHelper().put(PropertyKeys.tooltipPosition, _tooltipPosition);
    }
}

