package javadoc.dev_utils;

import java.util.HashMap;

/**
 * detail: 配置信息
 * @author Ttt
 */
public final class ApiConfig {

    private ApiConfig() {
    }

    // 文件保存路径
    public static final String FILE_SAVE_PATH = "D:/API/";
    // 本地路径
    public static final String LOCAL_PATH = "F:/Android/IDE/ASPro";
    // 包目录名
    public static final String PACKAGE = "dev.utils";
    // 文件整理路径
    public static final String PATH = LOCAL_PATH + "/DevUtils/DevLibUtils/src/main/java/dev/utils/";
    // Dev 目录路径
    public static final String DEV_PATH = LOCAL_PATH + "/DevUtils/DevLibUtils/src/main/java/dev/";
    // 作者 Github 地址
    public static final String GITHUB_AUTHOR_URL = "https://github.com/afkT";
    // GitHub 项目文件路径
    public static final String GITHUB_URL = GITHUB_AUTHOR_URL + "/DevUtils/blob/master/DevLibUtils/src/main/java/dev/utils/";
    // 版本号
    public static final String DEV_VERSION = "1.7.5";

    // = Map =
    // 包名目录注释
    public static final HashMap<String, String> sCatelogMap = new HashMap<>();
    // 忽略不保存的类
    public static final HashMap<String, String> sFilterClassMap = new HashMap<>();
    // 忽略不保存的方法
    public static final HashMap<String, String[]> sFilterMethodMap = new HashMap<>();

    // = Regex =
    // 方法名规则
    public static final String sMethodNameRegex = "[A-Za-z]+[2][A-Za-z][A-Za-z0-9]+";

    static {
        // 初始化 包名目录注释 Map
        initCatelogMap();
        // 初始化 忽略不保存的类 Map
        initFilterClassMap();
        // 初始化 忽略不保存的方法 Map
        initFilterMethodMap();
        // 初始化方法名正则表达式
        initMethodNameRegex();
    }

    // ==================
    // = 内部初始化方法 =
    // ==================

    /**
     * 初始化 包名目录注释 Map
     */
    private static void initCatelogMap() {
        sCatelogMap.put("dev.utils", "根目录");

        // ============
        // = APP 目录 =
        // ============

        sCatelogMap.put(".app", "APP 相关工具类");
        sCatelogMap.put(".app.anim", "动画工具类");

        sCatelogMap.put(".app.assist", "辅助类");
        sCatelogMap.put(".app.assist.manager", "管理器 如: TimerManager");

        sCatelogMap.put(".app.cache", "缓存工具类");
        sCatelogMap.put(".app.camera1", "摄像头相关 android.hardware.Camera");
        sCatelogMap.put(".app.image", "图片相关处理");
        sCatelogMap.put(".app.info", "APP 信息、PackageInfo 等");
        sCatelogMap.put(".app.logger", "日志库 DevLogger");
        sCatelogMap.put(".app.permission", "权限工具类");
        sCatelogMap.put(".app.player", "多媒体 ( 视频、音频 ) 播放封装");
        sCatelogMap.put(".app.share", "SharedPreferences 封装");

        sCatelogMap.put(".app.toast", "Toast");
        sCatelogMap.put(".app.toast.toaster", "Toaster 处理无通知权限");

        sCatelogMap.put(".app.wifi", "Wifi、热点工具类");

        // ===============
        // = Common 目录 =
        // ===============

        sCatelogMap.put(".common", "Java 工具类, 不依赖 android api");
        sCatelogMap.put(".common.assist", "各种快捷辅助类");
        sCatelogMap.put(".common.assist.search", "搜索相关 ( 文件搜索等 )");
        sCatelogMap.put(".common.cipher", "编 / 解码工具类");
        sCatelogMap.put(".common.encrypt", "加密工具类");
        sCatelogMap.put(".common.random", "随机概率算法工具类");
        sCatelogMap.put(".common.thread", "线程相关");
        sCatelogMap.put(".common.validator", "数据校验工具类");
    }

    /**
     * 初始化 忽略不保存的类 Map
     */
    private static void initFilterClassMap() {

        // =======
        // = APP =
        // =======

        sFilterClassMap.put("IPrinter.java", "");
        sFilterClassMap.put("IPreference.java", "");
        sFilterClassMap.put("IToast.java", "");
        sFilterClassMap.put("DefaultToastStyle.java", "");
        sFilterClassMap.put("WifiVo.java", "");

        // ==========
        // = Common =
        // ==========

        sFilterClassMap.put("Cipher.java", "");
        sFilterClassMap.put("Decrypt.java", "");
        sFilterClassMap.put("Encrypt.java", "");
    }

    /**
     * 初始化 忽略不保存的方法 Map
     */
    private static void initFilterMethodMap() {

        // =======
        // = APP =
        // =======

        sFilterMethodMap.put("PermissionUtils.java", new String[]{"start",
                "onCreate", "onGranted", "onDenied"});

        sFilterMethodMap.put("WifiHotUtils.java", new String[]{"onStarted",
                "onStopped", "onFailed"});

        sFilterMethodMap.put("HandlerUtils.java", new String[]{"onEnd"});

        sFilterMethodMap.put("OnLocationChangeListener.java",
                new String[]{"getLastKnownLocation", "onLocationChanged", "onStatusChanged"});

        sFilterMethodMap.put("SizeUtils.java", new String[]{"onGetSize"});

        sFilterMethodMap.put("KeyBoardUtils.java", new String[]{"onSoftInputChanged"});

        sFilterMethodMap.put("DevMediaManager.java", new String[]{"onPrepared",
                "onCompletion", "onBufferingUpdate", "onSeekComplete", "onError",
                "onVideoSizeChanged", "isLooping", "setMediaConfig"});

        sFilterMethodMap.put("DevVideoPlayerControl.java", new String[]{"onPrepared",
                "onCompletion", "onBufferingUpdate", "onSeekComplete", "onError",
                "onVideoSizeChanged", "isLooping", "setMediaConfig",
                "surfaceChanged", "surfaceCreated", "surfaceDestroyed"});

        sFilterMethodMap.put("CameraAssist.java", new String[]{"stopPreviewNotify",
                "startPreviewNotify"});

        sFilterMethodMap.put("ToastUtils.java", new String[]{"filter", "handlerContent"});

        sFilterMethodMap.put("AsyncExecutor.java", new String[]{"doInBackground",
                "onPostExecute", "onCanceled", "abort"});

        sFilterMethodMap.put("ToastTintUtils.java", new String[]{"getTextColor",
                "getTextSize", "getBackgroundTintColor", "getBackground", "getMaxLines",
                "getEllipsize", "getTypeface", "getTintIconColor", "isTintIcon",
                "filter", "handlerContent"});

        sFilterMethodMap.put("EditTextUtils.java", new String[]{"getMarkId",
                "isOperate", "setOperate", "getOperateState", "setOperateState",
                "getType", "setType", "beforeTextChanged", "onTextChanged", "afterTextChanged"});

        sFilterMethodMap.put("AutoFocusAssist.java", new String[]{"onAutoFocus"});

        sFilterMethodMap.put("PhoneUtils.java", new String[]{"printInfo"});

        sFilterMethodMap.put("DialogUtils.java", new String[]{"onLeftButton", "onRightButton", "onDismiss",
                "onSingleChoiceItems", "onPositiveButton", "onCancel", "onMultiChoiceItems"});

        sFilterMethodMap.put("SnackbarUtils.java", new String[]{"getRootGravity",
                "setRootGravity", "getRootCornerRadius", "setRootCornerRadius", "getRootBackgroundTintColor",
                "setRootBackgroundTintColor", "getRootBackground", "setRootBackground", "getRootMargin",
                "setRootMargin", "getRootAlpha", "setRootAlpha", "getTextGravity", "setTextGravity",
                "getTextColor", "setTextColor", "getTextSize", "setTextSize", "getTextMaxLines",
                "setTextMaxLines", "getTextEllipsize", "setTextEllipsize", "getTextTypeface", "setTextTypeface",
                "getTextPadding", "setTextPadding", "getActionGravity", "setActionGravity",
                "getActionColor", "setActionColor", "getActionSize", "setActionSize", "getActionPadding",
                "setActionPadding", "getActionCornerRadius", "setActionCornerRadius", "getActionBackgroundTintColor",
                "setActionBackgroundTintColor", "getActionBackground", "setActionBackground"});

        // ==========
        // = Common =
        // ==========

        sFilterMethodMap.put("FileBreadthFirstSearchUtils.java",
                new String[]{"isHandlerFile", "isAddToList", "OnEndListener"});

        sFilterMethodMap.put("FileDepthFirstSearchUtils.java",
                new String[]{"isHandlerFile", "isAddToList", "OnEndListener"});

        sFilterMethodMap.put("FileUtils.java", new String[]{"onReplace"});

        sFilterMethodMap.put("HttpURLConnectionUtils.java",
                new String[]{"onResponse", "onFail"});

        sFilterMethodMap.put("TimeKeeper.java", new String[]{"onEnd"});
    }

    /**
     * 初始化方法名正则表达式
     */
    private static void initMethodNameRegex() {
//        // 中间包含数字 2
//        sMethodNameRegex = ".*2+.*";
//        // 属于 xxx数字xxx
//        sMethodNameRegex = "[A-Za-z]+[0-9][A-Za-z]+";
//        // 属于 xxx2(xxx数字)
//        sMethodNameRegex = "[A-Za-z]+[2][A-Za-z0-9]+";
//        // 属于 xxx2x xx数字
//        sMethodNameRegex = "[A-Za-z]+[2][A-Za-z][A-Za-z0-9]+";
    }
}