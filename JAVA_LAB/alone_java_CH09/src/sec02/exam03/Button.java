package sec02.exam03;

public class Button {
	onClickListener listener;
	
	void setOnClickListener(onClickListener listener) {
		this.listener = listener;
	}
	
	void touch() {
		listener.onClick();
	}
	
	static interface onClickListener {
		void onClick();
	}
}
