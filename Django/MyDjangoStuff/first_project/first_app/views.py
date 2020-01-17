from django.shortcuts import render
from django.http import HttpResponse
from first_app.models import AccessRecord,Topic,Webpage
from first_app import forms
def index(request):
    webpages_list = AccessRecord.objects.order_by('date')

    my_dict = {'access_records': webpages_list}
    return render(request,"index.html", context=my_dict)
def index2(request):
    return HttpResponse("HelloWorld Zeki")

def indexView(request):
    my_dict = {'insert_content':"HELLO IM FROM FIRST APP"}
    return render(request,"index.html", context=my_dict)

def formResponse(request):
    form = forms.FormName()

    if request.method == 'POST':
        form = forms.FormName(request.POST)
        if form.is_valid():
            print("Validation")
            print('name '+form.cleaned_data['name'])
            print('email '+form.cleaned_data['email'])
            print('text '+form.cleaned_data['text'])

    return render(request,'form_page.html',{'form':form})
