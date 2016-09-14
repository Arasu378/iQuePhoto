package net.iquesoft.iquephoto.di.components;

import net.iquesoft.iquephoto.di.ActivityScope;
import net.iquesoft.iquephoto.di.modules.StartActivityModule;
import net.iquesoft.iquephoto.view.activity.StartActivity;
import net.iquesoft.iquephoto.view.fragment.GalleryImagesFragment;

import dagger.Component;

@ActivityScope
@Component(dependencies = IApplicationComponent.class,
        modules = StartActivityModule.class)

public interface IStartActivityComponent {
    void inject(StartActivity startActivity);

    void inject(GalleryImagesFragment galleryImagesFragment);
}
