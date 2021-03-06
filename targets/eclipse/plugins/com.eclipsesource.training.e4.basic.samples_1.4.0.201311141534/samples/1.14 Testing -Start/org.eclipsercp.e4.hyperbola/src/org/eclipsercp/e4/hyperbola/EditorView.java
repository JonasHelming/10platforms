package org.eclipsercp.e4.hyperbola;

import javax.annotation.PostConstruct;
import javax.inject.Inject;

import org.eclipse.e4.core.di.annotations.Optional;
import org.eclipse.e4.ui.di.Focus;
import org.eclipse.e4.ui.di.Persist;
import org.eclipse.e4.ui.model.application.ui.MDirtyable;
import org.eclipse.swt.SWT;
import org.eclipse.swt.events.KeyEvent;
import org.eclipse.swt.events.KeyListener;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Text;
import org.eclipsercp.e4.hyperbola.model.Contact;

public class EditorView {

	@Inject
	MDirtyable dirtyable;
	private Text text;

	private Contact currentValue;

	@Inject
	public EditorView(Composite parent) {
		text = new Text(parent, SWT.NONE);
		

	}
	
	@PostConstruct
	void init(){
		text.addKeyListener(new KeyListener() {

			@Override
			public void keyReleased(KeyEvent e) {
				if (currentValue == null || currentValue.getName() == null) {
					return;
				}
				dirtyable.setDirty(!currentValue.getName().equals(
						text.getText()));

			}

			@Override
			public void keyPressed(KeyEvent e) {

			}
		});
	}

	@Inject
	public void setInput(@Optional Contact contact) {
		if (contact == null) {
			return;
		}
		text.setText(contact.getName());
		currentValue = contact;
	}

	@Focus
	public void onFocus() {
		text.setFocus();
	}

	@Persist
	public void save() {
		currentValue.setName(text.getText());
		dirtyable.setDirty(false);
	}

}