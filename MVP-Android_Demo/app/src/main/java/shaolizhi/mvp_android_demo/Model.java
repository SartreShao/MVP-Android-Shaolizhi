package shaolizhi.mvp_android_demo;

/**
 * 由邵励治于2017/4/28创造.
 */

class Model implements ModelInterface {
    /**
     * 假设这里是从服务器获取的数据
     * @return bean是一个充满了服务器中数据的数据结构
     */
    @Override
    public Bean getBeanFromDatabase() {
        Bean bean = new Bean();
        bean.setString("你好，世界！");
        return bean;
    }
}
