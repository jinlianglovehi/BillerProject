
#### Glide 的使用方式

> https://www.jianshu.com/p/7ce7b02988a4

#### 加载图片的信息

String url = "http://img1.dzwww.com:8080/tupian_pl/20150813/16/7858995348613407436.jpg";
ImageView imageView = (ImageView) findViewById(R.id.imageView);
 Glide.with(context) .load(url) .into(imageView);



####