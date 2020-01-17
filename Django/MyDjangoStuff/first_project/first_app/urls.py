from django.conf.urls import url
from first_app import views


urlpatterns = [
    url(r'^$',views.index,name='index'),
    url('zeki',views.index2),
    url('indexview',views.indexView),
    url('form',views.formResponse),

]
