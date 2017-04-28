package shaolizhi.mvp_android_demo;

/**
 * 由邵励治于2017/4/28创造.
 */

class Presenter {
    private ModelInterface model;
    private ViewInterface view;

    Presenter(ViewInterface view) {
        this.view = view;
        model = new Model();
    }

    /**
     * 最终功能：让HelloWorld呈现在我们的TextView上
     */
    void makeHelloWorldInTextView(){
        Bean bean = model.getBeanFromDatabase();
        view.loadBeanToTextView(bean);
    }
}
