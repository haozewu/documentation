CustomerEdit editor = openEditor("sales$Customer.edit", customer, WindowManager.OpenType.THIS_TAB);
editor.addCloseListener((String actionId) -> {
    // do something
});